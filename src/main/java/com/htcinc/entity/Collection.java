package com.htcinc.entity;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by akulak on 24/10/16.
 */

@XmlRootElement
public class Collection {

    private List<Record> record;

    public void setRecords(List<Record> record) {
        this.record = record;
    }

    @XmlElement(name="record")
    public List<Record> getRecords() {
        return record;
    }
}

