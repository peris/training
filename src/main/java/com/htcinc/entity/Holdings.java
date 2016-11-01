package com.htcinc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by peris on 10/19/16.
 */

@Entity
@Table(name="holdings_t" , schema = "training")
public class Holdings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "holding_id")
    private List<Item> item;

    @Column(name = "content")
    private String content;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


}
