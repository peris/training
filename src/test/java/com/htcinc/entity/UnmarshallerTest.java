package com.htcinc.entity;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 24/10/16.
 */
public class UnmarshallerTest {


    @Test
    public void checkUnmarshalling(){

        URL resource = getClass().getResource("/com/htcinc/1MarcRecord.xml");
        System.out.println(resource);

        try {

            File file = new File(resource.toURI());
            JAXBContext jaxbContext = JAXBContext.newInstance(Collection.class);
            assertNotNull(jaxbContext);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            assertNotNull(jaxbContext);
            Collection collection= (Collection) unmarshaller.unmarshal(file);
            List<Records> recordList = collection.getRecords();
            for (Records records : recordList) System.out.println(records.getLeader());
        }

         catch (JAXBException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
