package com.fitness.gym.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.gym.model.Trainer;
import com.fitness.gym.service.TrainerService;

@RestController
@RequestMapping("trainer")
public class TrainerCtrl {
	
	@Autowired
	private TrainerService trainerService;
	
	@GetMapping("getAllTrainers")
	public List<Trainer> getAllTrainers() {
		
		return trainerService.getAllTrainers();
	}
	
	@PostMapping("addTrainer")
	public long addTrainer(@RequestBody Trainer entity) {
		return trainerService.addTrainer(entity);
	}
	
	@DeleteMapping("deleteTrainer/{id}")
	public void deleteTrainer(@PathVariable int id) {
		 trainerService.deleteTrainer(id);
	}
	
	

}
