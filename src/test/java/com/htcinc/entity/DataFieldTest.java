package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 24/10/16.
 */
public class DataFieldTest {
    @Test
    public void newDataField()throws Exception{
        DataField dataField = new DataField();
        assertNotNull(dataField);
    }
    @Test
    public void checkTag()throws Exception{
        DataField dataField = new DataField();
        dataField.setTag(024);
        int dataFieldTag = dataField.getTag();
        assertNotNull(dataFieldTag);
    }
    @Test
    public void checkInd1()throws Exception{
        DataField dataField = new DataField();
        dataField.setInd1(8);
        int dataFieldInd1 = dataField.getInd1();
        assertNotNull(dataFieldInd1);
    }
    @Test
    public void checkInd2()throws Exception{
        DataField dataField = new DataField();
        dataField.setInd2(4);
        int dataFieldInd2 = dataField.getInd2();
        assertNotNull(dataFieldInd2);
    }
    @Test
    public void checkSubField() throws Exception {
        DataField dataField = new DataField();
        List<SubField> subFields = new ArrayList<>();
        dataField.setSubFields(subFields);
        List<SubField> dataSubFields = dataField.getSubFields();
        assertNotNull(dataSubFields);
    }


}
