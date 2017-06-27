package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.ScheduleTrainingDAO;
import com.cognizant.entity.ScheduleTraining;
import com.cognizant.entity.TrainerInfo;
@Component
public class ScheduleTrainingService {
	
	@Autowired
	ScheduleTrainingDAO scheduleTrainingDAO;
	TrainerInfo trainerInfo;
	public void insertTrainerInfo(TrainerInfo trainerInfo) {
		System.out.println("in service"+trainerInfo);
		scheduleTrainingDAO.insertTrainerInfo(trainerInfo);
		System.out.println("in service"+trainerInfo);
	}
	
	@Transactional
	public void insertScheduleTraining(int trainerId, ScheduleTraining sTraining) {
		TrainerInfo trainerInfo=scheduleTrainingDAO.insertScheduleTraining(trainerId);
		if(trainerInfo.getTrainerId()==trainerId){
			System.out.println("******************************");
			sTraining.setTrainerInfo(trainerInfo); 
			List<ScheduleTraining> sTrainingList=new ArrayList<ScheduleTraining>();
			sTrainingList.add(sTraining);
			trainerInfo.setScheduleTraining(sTrainingList);
		}
		else{
			
		}
		
		
	}

}
