package com.htcinc.entity;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by akulak on 24/10/16.
 */
public class Record {

    private String leader;

    private List<ControlField> controlField;

    private List<DataField> dataField;

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @XmlElement(name="leader")
    public String getLeader() {
        return leader;
    }

    public void setControlField(List<ControlField> controlField) {
        this.controlField = controlField;
    }

    @XmlElement(name="controlfield")
    public List<ControlField> getControlField() {
        return controlField;
    }

    public void setDataField(List<DataField> dataField) {
        this.dataField = dataField;
    }

    @XmlElement(name="datafield")
    public List<DataField> getDataField() {
        return dataField;
    }
}
