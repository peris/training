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

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by akulak on 27/10/16.
 */

@EnableJpaRepositories
public class BibRepositoryTest extends TrainingApplicationTests {

    @Autowired
    BibRepository bibRepository;

    @Test
    public void saveBibSingleHoldingsSingleItem() throws Exception {

        Logger logger = LoggerFactory.getLogger(BibRepositoryTest.class);

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


}
