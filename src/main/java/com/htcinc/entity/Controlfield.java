package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by harikrishnanv on 25/10/16.
 */

public class Controlfield {

    private int tag;
    private String desc;

    public void setTag(int tag) {
        this.tag = tag;
    }

    @XmlAttribute(name="tag")
    public int getTag() {
        return tag;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }

    @XmlValue
    public String getDesc() {
        return desc;
    }
}
