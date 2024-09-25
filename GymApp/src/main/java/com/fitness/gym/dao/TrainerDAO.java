package com.fitness.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.gym.model.Trainer;

@Repository
public interface TrainerDAO extends JpaRepository<Trainer, Integer> {

}
