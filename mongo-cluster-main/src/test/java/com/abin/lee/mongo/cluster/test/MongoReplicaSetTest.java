package com.abin.lee.mongo.cluster.test;


import com.abin.lee.mongo.cluster.service.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by abin
 * Be Created in 2016/8/24.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-mongo.xml"})
public class MongoReplicaSetTest {
    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    MessageService messageService;

    @Test
    public void testSayHello() throws InterruptedException {

        while (true) {
            LOGGER.info("---------------start---------------------");
            messageService.messageStore(null);
            Thread.sleep(1000);
            LOGGER.info("---------------end---------------------");
        }


    }
}
