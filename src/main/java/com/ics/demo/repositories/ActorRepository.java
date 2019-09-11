package com.ics.demo.repositories;

import com.ics.demo.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository <Actor, Long> {

}
