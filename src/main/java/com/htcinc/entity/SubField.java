package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by akulak on 24/10/16.
 */
public class SubField {

    @XmlAttribute
    private String code;

    public SubField() {
    }

    public SubField(String code) {
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
