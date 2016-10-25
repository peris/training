package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 24/10/16.
 */
public class RecordTest {
    @Test
    public void newRecord() throws Exception{
        Record record = new Record();
        assertNotNull(record);
    }

    @Test
    public void checkLeader() throws Exception {
        Record record = new Record();
        record.setLeader("");
        String recordLeader = record.getLeader();
        assertNotNull(recordLeader);
    }
    @Test
    public void checkControlField() throws Exception{
        Record record = new Record();
        List<ControlField> controlFields = new ArrayList<>();
        record.setControlField(controlFields);
        List<ControlField> recordControlField = record.getControlField();
        assertNotNull(recordControlField);
    }
    @Test
    public void checkDataField() throws Exception{
        Record record = new Record();
        List<DataField> dataFields = new ArrayList<>();
        record.setDataField(dataFields);
        List<DataField> recordControlField = record.getDataField();
        assertNotNull(recordControlField);
    }

}
