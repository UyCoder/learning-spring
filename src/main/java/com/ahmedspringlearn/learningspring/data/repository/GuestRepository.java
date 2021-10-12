package com.ahmedspringlearn.learningspring.data.repository;

import com.ahmedspringlearn.learningspring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
