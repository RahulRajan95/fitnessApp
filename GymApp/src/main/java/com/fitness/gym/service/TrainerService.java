package com.fitness.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.gym.dao.TrainerDAO;
import com.fitness.gym.model.Trainer;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerDAO trainerDAO;

	public List<Trainer> getAllTrainers() {
		
		return trainerDAO.findAll();
	}

	public long addTrainer( Trainer entity) {
		trainerDAO.save(entity);
		
		return entity.getId();
		
	}

	public void deleteTrainer(int id) {
		trainerDAO.deleteById(id);
	}
	
	
	

}
