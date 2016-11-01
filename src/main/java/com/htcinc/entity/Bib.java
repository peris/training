package com.htcinc.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by peris on 10/19/16.
 */

@Entity
@Table(name="bib_t" , schema = "training")
public class Bib {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="bib_id" )
    private List<Holdings> holdings;

    @Column(name="content")
    private String content;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setHoldings(List<Holdings> holdings) {
        this.holdings = holdings;
    }

    public List<Holdings> getHoldings() {
        return holdings;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Bib[id=%d, content='%s']",
                id, content);
        if (holdings != null) {
            for(Holdings holding : holdings) {
                result += String.format(
                        "Holdings[id=%d, content='%s']",
                        holding.getId(), holding.getContent());
                if(holding.getItem() != null){
                        List<Item> items = holding.getItem();
                        for(Item item : items) {
                            result += String.format(
                                    "Item[id=%d, content='%s']%n",
                                    item.getId(), item.getContent());
                        }
                }

            }
        }
        return result;
    }
}
