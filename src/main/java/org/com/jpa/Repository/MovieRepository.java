package org.com.jpa.Repository;

import org.com.jpa.entities.Movies;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movies, Integer>{

}
