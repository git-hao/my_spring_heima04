package com.hao.ui;

import com.hao.service.UserService;
import com.hao.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Describe com.com.hao.ui
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 * 模拟表现层，调用业务层
 */
public class Client {
    public static void main(String[] args){

        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //验证依赖注入方式
        //构造函数注入
        UserService us = (UserService) ac.getBean("userService");
        //set方法注入
        UserService us2 = (UserService) ac.getBean("userService2");
        //混用标签，集合/复杂注入
        UserService us3 = (UserService)ac.getBean("userService3");

        us3.saveUser();


    }

}
