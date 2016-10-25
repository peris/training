package com.htcinc.entity;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class SubfieldsTest {

    @Test
    public void newObject() throws Exception {
        Subfields subfields = new Subfields();
        assertNotNull(subfields);
    }

    @Test
    public void checkAttributeCode() throws Exception {
        Subfields subfields = new Subfields();
        subfields.setCode('a');
        Character subfieldsCode = subfields.getCode();
        System.out.println(subfieldsCode);
    }
}
