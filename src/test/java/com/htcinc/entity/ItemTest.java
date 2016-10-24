package com.htcinc.entity;

import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 20/10/16.
 */
public class ItemTest {

    @Test
    public void newObject() throws Exception {
        Item item = new Item();
        assertNotNull(item);
    }
    @Test
    public void checkId() throws Exception {
        Item item = new Item();
        item.setId(1);
        Integer itemId = item.getId();
        assertNotNull(itemId);
    }
    @Test
    public void content() throws Exception {
        Item item = new Item();
        item.setContent("item content");
        String content = item.getContent();
        assertNotNull(content);
    }
}
