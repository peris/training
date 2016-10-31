package com.htcinc.entity;

import javax.persistence.*;

/**
 * Created by akulak on 20/10/16.
 */


@Entity
@Table(name="item_t" , schema = "training" )
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="content")
    private String content;

    public void setId(Integer id) {
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
