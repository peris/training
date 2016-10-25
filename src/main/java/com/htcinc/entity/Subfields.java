package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class Subfields {

    @XmlAttribute
    private char code;

    public void setCode(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }
}
