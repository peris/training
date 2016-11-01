package com.htcinc.repository;

import com.htcinc.entity.Bib;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by akulak on 27/10/16.
 */
public interface BibRepository extends JpaRepository<Bib,Integer> {

    Bib save(Bib bib);

    void delete(Integer integer);

    List<Bib> findAll();

}
