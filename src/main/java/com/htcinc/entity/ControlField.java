package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;


/**
 * Created by akulak on 24/10/16.
 */
public class ControlField {

    private int tag;
    private String description;

    public void setTag(int tag) {
        this.tag = tag;
    }

    @XmlAttribute(name = "tag")
    public int getTag() {
        return tag;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    @XmlValue
    public String getDescription() {
        return description;
    }
}
