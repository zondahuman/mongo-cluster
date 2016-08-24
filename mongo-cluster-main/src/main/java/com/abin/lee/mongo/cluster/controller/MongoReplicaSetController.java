package com.abin.lee.mongo.cluster.controller;

import com.abin.lee.mongo.cluster.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by abin
 * Be Created in 2016/8/24.
 */
@Controller
@RequestMapping("/cluster")
public class MongoReplicaSetController {

    protected final static Logger LOGGER = LoggerFactory.getLogger(MongoReplicaSetController.class);


    @Resource
    MessageService messageService;

    @ResponseBody
    @RequestMapping(value = "/valid")
    public String valid(String param) {
        String result = "";
        try {
            this.messageService.messageStore(null);
        } catch (Exception e) {
            LOGGER.error("e={} message={}", e, e.getMessage());
        }
        return result;
    }


}
