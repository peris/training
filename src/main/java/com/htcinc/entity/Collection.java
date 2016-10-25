package com.htcinc.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by harikrishnanv on 24/10/16.
 */
@XmlRootElement
public class Collection {


    private List<Records> records;

    public void setRecords(List<Records> records) {
        this.records = records;
    }

    @XmlElement(name="record")
    public List<Records> getRecords() {
        return records;
    }
}
