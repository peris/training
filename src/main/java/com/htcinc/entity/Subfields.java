package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class Subfields {


    private char code;

    public void setCode(char code) {
        this.code = code;
    }

    @XmlAttribute
    public char getCode() {
        return code;
    }
}
