package com.hao.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * @Describe com.com.hao.service
 * @Auther wenhao chen
 * @CreateDate 2019/7/28
 * @Version 1.0
 *
 */
public class UserServiceImpl3 implements UserService{

    //复杂类型注入
    private String[] strs;
    private List<String> list;
    private Properties prop;

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public void saveUser() {
        System.out.println("已保存");
        System.out.println(Arrays.toString(strs));
        System.out.println(list);
        System.out.println(prop);
    }

}
