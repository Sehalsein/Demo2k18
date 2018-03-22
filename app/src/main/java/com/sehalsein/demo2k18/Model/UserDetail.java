package com.sehalsein.demo2k18.Model;

/**
 * Created by sehalsein on 22/03/18.
 */

public class UserDetail {

    private String id;
    private String name;
    private String age;

    public UserDetail() {
    }

    public UserDetail(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
