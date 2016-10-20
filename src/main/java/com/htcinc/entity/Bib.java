package com.htcinc.entity;

import java.util.List;

/**
 * Created by peris on 10/19/16.
 */
public class Bib {
    private Integer id;
    private List<Holdings> holdings;
    private String content;

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId() {
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
}
