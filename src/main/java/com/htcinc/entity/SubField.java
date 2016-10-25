package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by akulak on 24/10/16.
 */
public class SubField {

    private String code;

    private String description;

    public void setCode(String code) {
        this.code = code;
    }

    @XmlAttribute(name="code")
    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlValue
    public String getDescription() {
        return description;
    }
}
