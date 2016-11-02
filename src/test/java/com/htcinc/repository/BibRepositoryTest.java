package com.htcinc.repository;

import com.htcinc.TrainingApplicationTests;
import com.htcinc.entity.Bib;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import static junit.framework.TestCase.assertNotNull;

/**
 * Created by harikrishnanv on 1/11/16.
 */
public class BibRepositoryTest extends TrainingApplicationTests {


    @Autowired
    BibRepository bibRepository;

    @Test
    public void checkSaveSingleBib() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setContent("Test");
        bib = bibRepository.save(bib);
        System.out.println(bib);

    }

    @Test
    public void checkDelete() throws Exception {
        bibRepository.delete(1);

    }

    @Test
    public void checkUpdate() throws Exception {
        Bib bib = new Bib();
        assertNotNull(bib);
        bib.setId(1);
        bib.setContent("Test1");
        bib=bibRepository.save(bib);
        System.out.println(bib);
    }

}
