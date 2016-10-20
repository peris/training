package com.htcinc.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by peris on 10/19/16.
 */
public class BibTest {

    @Test
    public void newBib() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
    }

    @Test
    public void checkId() throws Exception {
        Bib bib = new Bib();
        bib.setId(1);
        Integer bibId = bib.getId();
        assertNotNull(bibId);
        System.out.println(bibId);
    }

    @Test
    public void holdings() throws Exception {
        Bib bib = new Bib();
        List<Holdings> holdings = new ArrayList();
        bib.setHoldings(holdings);
        List<Holdings> bibHoldings = bib.getHoldings();
        assertNotNull(bibHoldings);
    }

    @Test
    public void content() throws Exception {
        Bib bib = new Bib();
        bib.setContent("bib content");
        String bibContent = bib.getContent();
        assertNotNull(bibContent);
    }

}
