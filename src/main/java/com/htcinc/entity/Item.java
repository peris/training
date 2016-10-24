package com.htcinc.entity;

/**
 * Created by akulak on 20/10/16.
 */
public class Item {
    private Integer id;
    private String content;

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
