package com.htcinc.repository;

import com.htcinc.TrainingApplicationTests;
import com.htcinc.entity.Bib;
import com.htcinc.entity.Holdings;
import com.htcinc.entity.Item;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 27/10/16.
 */

public class BibRepositoryTest extends TrainingApplicationTests {

   private static final Logger logger = LoggerFactory.getLogger(BibRepositoryTest.class);


    @Autowired
    BibRepository bibRepository;

    @Test
    public void saveBibSingleHoldingsSingleItem() throws Exception {

        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setContent("sample bib");

        Holdings holdings = new Holdings();
        assertNotNull(holdings);
        holdings.setContent("sample holding");

        Item item = new Item();
        assertNotNull(item);
        item.setContent("sample item");

        holdings.setItem(Arrays.asList(item));

        bib.setHoldings(Arrays.asList(holdings));

        assertNotNull(bibRepository);
        Bib bib1 = bibRepository.save(bib);
        logger.info("Saved " + bib1);

    }

    @Test
    public void updateBibRecord() throws Exception{
        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setId(3);
        bib.setContent("updated sample bib");
        bib=bibRepository.save(bib);
        logger.info("updated successfully" + bib);

    }


    @Test
    public void deleteBib() throws Exception{
        bibRepository.delete(4);
        logger.info("deleted successfully");
    }

    @Test
    public void findAllBibs() throws Exception{
        List<Bib> bibList = bibRepository.findAll();
        assertNotNull(bibList);
        for(Bib bib : bibList){
            assertNotNull(bib);
            logger.info("bibrecords in db : "+bib);
       }
    }


}
