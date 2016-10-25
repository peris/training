package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by akulak on 24/10/16.
 */
public class DataField {

    @XmlAttribute
    private int tag;

    @XmlAttribute
    private int ind1;

    @XmlAttribute
    private int ind2;

    @XmlElement
    private List<SubField> subFields;

    public DataField() {
    }

    public DataField(int tag, int ind1, int ind2, List<SubField> subFields) {
        this.tag = tag;
        this.ind1 = ind1;
        this.ind2 = ind2;
        this.subFields = subFields;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }


    public int getTag() {
        return tag;
    }

    public void setInd1(int ind1) {
        this.ind1 = ind1;
    }


    public int getInd1() {
        return ind1;
    }

    public void setInd2(int ind2) {
        this.ind2 = ind2;
    }

    public int getInd2() {
        return ind2;
    }

    public void setSubFields(List<SubField> subFields) {
        this.subFields = subFields;
    }

    public List<SubField> getSubFields() {
        return subFields;
    }
}
