package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 24/10/16.
 */
public class CollectionTest {
    @Test
    public void newCollection() throws Exception {
        Collection collection = new Collection();
        assertNotNull(collection);
    }

    @Test
    public void checkRecords() throws Exception {
        Collection collection = new Collection();
        List<Record> recordList = new ArrayList<>();
        collection.setRecords(recordList);
        List<Record> collRecords = collection.getRecords();
        assertNotNull(collRecords);
    }


}
