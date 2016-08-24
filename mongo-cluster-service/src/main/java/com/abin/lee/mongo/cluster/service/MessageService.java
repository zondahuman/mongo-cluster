package com.abin.lee.mongo.cluster.service;


import com.abin.lee.mongo.cluster.model.Message;
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

public interface MessageService {

    Logger logger = LoggerFactory.getLogger("MessageServiceImpl");

    public void messageStore(String json) ;



}
