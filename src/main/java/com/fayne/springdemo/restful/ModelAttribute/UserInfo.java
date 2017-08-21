package com.fayne.springdemo.restful.ModelAttribute;

/**
 * Created by fayne on 2017/8/21
 */
public class UserInfo {
    private int age;

    public UserInfo(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
