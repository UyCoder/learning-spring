package com.ahmedspringlearn.learningspring.data.repository;

import com.ahmedspringlearn.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationsByReservationDate(Date date);
}
