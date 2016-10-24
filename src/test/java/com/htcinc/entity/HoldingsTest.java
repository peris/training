package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by peris on 10/19/16.
 */
public class HoldingsTest {
    @Test
    public void newObject() throws Exception {
        Holdings holdings = new Holdings();
        assertNotNull(holdings);
    }
    @Test
    public void checkid() throws Exception {
        Holdings holdings = new Holdings();
        holdings.setId(1);
        Integer holdingsId =holdings.getId();
        assertNotNull(holdingsId);
    }
    @Test
    public void item() throws Exception {
        Holdings holdings = new Holdings();
        List<Item> item = new ArrayList<>();
        holdings.setItem(item);
        List<Item> holdingsItem = holdings.getItem();
        assertNotNull(holdingsItem);
    }
    @Test
    public void content() throws Exception {
        Holdings holdings = new Holdings();
        holdings.setContent("holding content");
        String content = holdings.getContent();
        assertNotNull(content);

    }
}
