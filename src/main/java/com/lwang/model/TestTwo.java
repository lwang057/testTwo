package com.lwang.model;

import org.springframework.data.annotation.Id;

/**
 * TestTwo.class
 *
 * @author lwang
 * @date 2017/11/10.
 */
public class TestTwo {

    @Id
    private String id;
    private String name;
    private String pice;
    private String count;

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

    public String getPice() {
        return pice;
    }

    public void setPice(String pice) {
        this.pice = pice;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
