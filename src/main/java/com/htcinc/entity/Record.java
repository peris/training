package com.htcinc.entity;



import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by akulak on 24/10/16.
 */
public class Record {

    @XmlElement
    private String leader;

    @XmlElement
    private List<ControlField> controlField;

    @XmlElement
    private List<DataField> dataField;

    public Record() {
    }

    public Record(String leader, List<ControlField> controlField, List<DataField> dataField) {
        this.leader = leader;
        this.controlField = controlField;
        this.dataField = dataField;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeader() {
        return leader;
    }

    public void setControlField(List<ControlField> controlField) {
        this.controlField = controlField;
    }

    public List<ControlField> getControlField() {
        return controlField;
    }

    public void setDataField(List<DataField> dataField) {
        this.dataField = dataField;
    }

    public List<DataField> getDataField() {
        return dataField;
    }
}
