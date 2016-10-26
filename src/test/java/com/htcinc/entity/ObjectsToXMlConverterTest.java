package com.htcinc.entity;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 25/10/16.
 */
public class ObjectsToXMlConverterTest {

    @Test
    public void checkMarshalling() throws Exception{
        URL resource = getClass().getResource("/com/htcinc/MarshallMarcRecord.xml");
        //File file = new File(resource.toURI());
        JAXBContext jaxbContext = JAXBContext.newInstance(Collection.class);
        assertNotNull(jaxbContext);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        SubField subField = new SubField();
        subField.setCode("abc");

        List<SubField> subFields = new ArrayList<>();
        subFields.add(subField);

        DataField dataField = new DataField();
        dataField.setTag(01);
        dataField.setInd1(11);
        dataField.setInd2(12);
        dataField.setSubFields(subFields);

        List<DataField> dataFields = new ArrayList<>();
        dataFields.add(dataField);

        ControlField controlField = new ControlField();
        controlField.setTag(12);
        controlField.setDescription("sample");

        List<ControlField> controlFields = new ArrayList<>();
        controlFields.add(controlField);



        Record record = new Record();
        record.setControlField(controlFields);
        record.setDataField(dataFields);

        List<Record> records = new ArrayList<>();
        records.add(record);

        Collection collection = new Collection();
        collection.setRecords(records);


        marshaller.marshal(collection,new File(resource.toURI()));
        marshaller.marshal(collection, System.out);



    }
}
