package com.demo.log;

import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Component
public class UserDao {
     private Logger log = LoggerFactory.getLogger(UserDao.class);
    public  void  log(){
        log.debug("++++++my deubg");
        log.warn("++++++my warn");
        log.error("++++++my error");


    }
}
