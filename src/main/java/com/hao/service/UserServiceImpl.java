package com.hao.service;

import java.util.Date;

/**
 * @Describe com.com.hao.service
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 *
 */
public class UserServiceImpl implements UserService{


    //构造函数注入，定义不同类型数据，验证注入方式，经常变化的数据不适用注入方式
    private String name;
    private Integer age;
    private Date birthday;

    //改写构造函数，配合依赖注入
    public UserServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveUser() {
        System.out.println("已保存");
        System.out.println("name="+name+"---age="+age+"---birthday="+birthday);
    }

}
