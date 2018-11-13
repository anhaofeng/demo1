package com.demo;

import org.springframework.stereotype.Component;

//@Component
public class UserDao {

     public  void  add(String username,String password){
         System.out.println(username+"+"+password);
     }
}
