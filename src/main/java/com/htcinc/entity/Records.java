package com.htcinc.entity;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by harikrishnanv on 24/10/16.
 */
public class Records {

    private String leader;
    private List<Controlfield> controlfields;
    private List<Datafield> datafields;

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @XmlElement
    public String getLeader() {
        return leader;
    }

    public void setControlfields(List<Controlfield> controlfields) {
        this.controlfields = controlfields;
    }

    @XmlElement
    public List<Controlfield> getControlfields() {
        return controlfields;
    }

    public void setDatafields(List<Datafield> datafields) {
        this.datafields = datafields;
    }

    @XmlElement
    public List<Datafield> getDatafields() {
        return datafields;
    }
}
