package org.com.jpa.Repository;

import org.com.jpa.entities.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<Users, Integer>{
	
	@Query("select u from User u where u.email:=email")
	public Users getUserByName(@Param("email") String email);
}
