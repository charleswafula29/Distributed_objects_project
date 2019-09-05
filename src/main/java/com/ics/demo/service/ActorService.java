package com.ics.demo.service;

import com.ics.demo.models.Actor;

import java.util.List;

public interface ActorService {

    List<Actor> findAll();

    Actor findById(Long id);

    Actor Create(Actor actor);

    void delete(Long id);

    Actor update(Actor actor);

    Actor update(Long id,Actor actor);
}