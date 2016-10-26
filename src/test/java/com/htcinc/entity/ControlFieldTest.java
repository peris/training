package com.htcinc.entity;

import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 24/10/16.
 */
public class ControlFieldTest {
    @Test
    public void newControlField() throws Exception{
        ControlField controlField = new ControlField();
        assertNotNull(controlField);
    }
    @Test
    public void checkTag() throws Exception {
        ControlField controlField = new ControlField();
        controlField.setTag(001);
        int controlTag = controlField.getTag();
        assertNotNull(controlTag);

    }

    @Test
    public void checkDescription() throws Exception {
        ControlField controlField = new ControlField();
        controlField.setDescription("desc");
        String description = controlField.getDescription();
        assertNotNull(description);

    }


}
