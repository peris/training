package com.htcinc.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class Datafield {

    private int tag;


    private int ind1;


    private int ind2;


    private List<Subfields> subfield;

    public void setTag(int tag) {
        this.tag = tag;
    }

    @XmlAttribute
    public int getTag() {
        return tag;
    }

    public void setInd1(int ind1) {
        this.ind1 = ind1;
    }

    @XmlAttribute
    public int getInd1() {
        return ind1;
    }

    public void setInd2(int ind2) {
        this.ind2 = ind2;
    }

    @XmlAttribute
    public int getInd2() {
        return ind2;
    }

    public void setSubfield(List<Subfields> subfield) {
        this.subfield = subfield;
    }

    @XmlElement
    public List<Subfields> getSubfield() {
        return subfield;
    }
}
