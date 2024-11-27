package org.com.jpa.Repository;

import org.com.jpa.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer>{

}
