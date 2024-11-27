package org.com.jpa.Repository;

import org.com.jpa.entities.Bookings;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Bookings, Integer>{

}
