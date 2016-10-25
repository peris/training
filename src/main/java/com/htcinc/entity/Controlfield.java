package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by harikrishnanv on 25/10/16.
 */

public class Controlfield {
    @XmlAttribute
    private int tag;

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }
}
