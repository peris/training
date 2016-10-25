package com.htcinc.entity;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class MarshallerTest {

    @Test
    public void checkMarshalling() throws Exception {
        Collection collection = new Collection();
        Records records = new Records();
        Controlfield controlfield = new Controlfield();
        Datafield datafield = new Datafield();
        Subfields subfields = new Subfields();

        //ArrayLists
        List<Subfields> subfieldsList = new ArrayList<>();
        List<Controlfield> controlfieldList = new ArrayList<>();
        List<Datafield> datafieldList = new ArrayList<>();
        List<Records> recordsList = new ArrayList<>();

        //setters for subfields
        subfields.setCode("a");
        subfields.setDesc("TestCode");
        //addIntoArrayList
        subfieldsList.add(subfields);

        //setters for datafield
        datafield.setInd1(001);
        datafield.setInd2(002);
        datafield.setTag(001);
        datafield.setSubfield(subfieldsList);
        //addIntoArrayList
        datafieldList.add(datafield);

        //setters for controlfield
        controlfield.setTag(001);
        controlfield.setDesc("TestControlField");
        //addIntoArrayList
        controlfieldList.add(controlfield);

        //setters for records
        records.setLeader("TestLeader");
        records.setControlfields(controlfieldList);
        records.setDatafields(datafieldList);
        //addIntoArrayList
        recordsList.add(records);

        //setters for collection
        collection.setRecords(recordsList);

        URL resource = getClass().getResource("/com/htcinc/1MarcRecord.xml");
        System.out.println(resource);

        File file = new File(resource.toURI());
        JAXBContext jaxbContext = JAXBContext.newInstance(Collection.class);
        assertNotNull(jaxbContext);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        assertNotNull(jaxbMarshaller);
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(collection, file);
        jaxbMarshaller.marshal(collection, System.out);

    }
}
