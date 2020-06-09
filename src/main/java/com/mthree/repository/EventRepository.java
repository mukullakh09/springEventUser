package com.mthree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mthree.models.Event;

public interface EventRepository extends JpaRepository<Event,Integer>{

}
