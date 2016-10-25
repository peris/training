package com.htcinc.entity;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 25/10/16.
 */
public class XmlToObjectsConverterTest {

    @Test
    public void checkUnMarshalling() throws Exception {
        URL resource = getClass().getResource("/com/htcinc/1MarcRecord.xml");
        assertNotNull(resource);
        File file = new File(resource.toURI());
        JAXBContext jaxbContext = JAXBContext.newInstance(Collection.class);
        assertNotNull(jaxbContext);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        assertNotNull(unmarshaller);
        Collection rootElement = (Collection) unmarshaller.unmarshal(file);
        assertNotNull(rootElement);
        for(Record records : rootElement.getRecords()){
            assertNotNull(records);
            System.out.println("Leader:"+records.getLeader());
            for(ControlField controlFields : records.getControlField()){
                assertNotNull(controlFields);
                if(controlFields.getTag()==5){
                    System.out.println("controlField for tag 5:" + controlFields.getDescription());
                }
            }

        }

    }

}
