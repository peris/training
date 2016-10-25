package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class DatafieldTest {

    @Test
    public void newObject() throws Exception {
        Datafield datafield = new Datafield();
        assertNotNull(datafield);
    }

    @Test
    public void checkAttributeTag() throws Exception {
        Datafield datafield = new Datafield();
        datafield.setTag(001);
        Integer datafieldTag = datafield.getTag();
        System.out.println(datafieldTag);
    }

    @Test
    public void checkAttributeInd1() throws Exception {
        Datafield datafield = new Datafield();
        datafield.setInd1(001);
        Integer datafieldInd1 = datafield.getInd1();
        System.out.println(datafieldInd1);
    }

    @Test
    public void checkAttributeInd2() throws Exception {
        Datafield datafield = new Datafield();
        datafield.setInd2(002);
        Integer datafieldInd2 = datafield.getInd2();
        System.out.println(datafieldInd2);
    }

    @Test
    public void checkSubfields() throws Exception {
        Datafield datafield = new Datafield();
        List<Subfields> subfields = new ArrayList<>();
        datafield.setSubfield(subfields);
        List<Subfields> datafieldSubfields = datafield.getSubfield();
        assertNotNull(datafieldSubfields);
    }
}
