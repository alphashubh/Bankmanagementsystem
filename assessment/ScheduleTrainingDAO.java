package com.cognizant.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TrainerInfo;
@Component
public class ScheduleTrainingDAO {
	@PersistenceContext
	private EntityManager em;
	
	
	
	@Transactional
	public void insertTrainerInfo(TrainerInfo trainerInfo) {
		System.out.println("in dao"+trainerInfo);
		em.persist(trainerInfo);
		System.out.println("in dao"+trainerInfo);
		
	}

	public TrainerInfo insertScheduleTraining(int trainerId) {
		TrainerInfo trainerInfo=em.find(TrainerInfo.class, trainerId);
		System.out.println("in dao"+trainerInfo);
		return trainerInfo;
		
	}

}
