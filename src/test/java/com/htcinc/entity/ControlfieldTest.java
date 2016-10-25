package com.htcinc.entity;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 25/10/16.
 */
public class ControlfieldTest {

    @Test
    public void newObject() throws Exception {
        Controlfield controlfield = new Controlfield();
        assertNotNull(controlfield);
    }

    @Test
    public void checkAttributeTag() throws Exception {
        Controlfield controlfield = new Controlfield();
        controlfield.setTag(001);
        Integer controlfieldTag = controlfield.getTag();
        System.out.println(controlfieldTag);
    }
}
