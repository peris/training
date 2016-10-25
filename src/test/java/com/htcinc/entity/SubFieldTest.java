package com.htcinc.entity;

import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 24/10/16.
 */
public class SubFieldTest {
    @Test
    public void newSubField() throws Exception{
        SubField subField = new SubField();
        assertNotNull(subField);
    }
    @Test
    public void checkCode()throws Exception{
        SubField subField = new SubField();
        subField.setCode("a");
        String subFieldCode = subField.getCode();
        assertNotNull(subFieldCode);
    }
}
