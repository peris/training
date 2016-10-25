package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;


/**
 * Created by akulak on 24/10/16.
 */
public class ControlField {

    @XmlAttribute
    private int tag;

    public ControlField() {
    }

    public ControlField(int tag) {
        this.tag = tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }
}
