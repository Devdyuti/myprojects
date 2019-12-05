package org.tutorial.spring.solr.repository;

import java.io.Serializable;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolrRepository<T> extends SolrCrudRepository<T, Serializable>{

}
