package com.abin.lee.mongo.cluster.service.impl;


import com.abin.lee.mongo.cluster.model.Message;
import com.abin.lee.mongo.cluster.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by abin
 * Be Created in 2016/8/24.
 *
 */
//声明作为Spring的Bean，Bean的名称是messageService
@Service
public class MessageServiceImpl implements MessageService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MongoTemplate mongoTemplate;

    public void messageStore(String json) {

        Message message = new Message();
        // protocol
        message.setProtocol("protocol");
        // version
        message.setVersion("version");
        // header_from
        message.setHeader_from("header/from");
        // Header_to
        message.setHeader_to("header/to");
        // Header_id header/id
        message.setHeader_id("header/id");

        message.setHeader_opCode("opCode");

        message.setFrom_fulljid("fromFullJid");
        // barejid
        message.setFrom("from");
        // body_to
        message.setTo_fulljid("toFullJid");
        // barejid
        message.setTo("toBareID");

        message.setSendate(new Date().getTime());

        message.setMessageId("messageId");

        message.setGenre(1);

        // body_sender
        message.setSender("sender");
        // body_content
        message.setContent("content");
        // body_remind
        message.setRemind("remind");

        // body
        message.setBody("this is chat message");
        // sequence
        message.setSequence(new Date().getTime());
        // org
        message.setOrg("org");
        // createTime
        message.setCreateTime(new Date().getTime());
        // log
        logger.info(message.toString());
        // save
        logger.debug("begin save to mongo!");
        try {
            mongoTemplate.save(message);
            Query query = new Query();
            logger.debug("Message count:"
                    + mongoTemplate.count(query, "Message"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.debug("end save to mongo!");
    }
}
