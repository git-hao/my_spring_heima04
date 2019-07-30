package com.hao.service;

import java.util.Date;

/**
 * @Describe com.com.hao.service
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 *
 */
public class UserServiceImpl2 implements UserService{


    //set方法注入
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveUser() {
        System.out.println("已保存");
        System.out.println("name="+name+"---age="+age+"---birthday="+birthday);
    }

}
