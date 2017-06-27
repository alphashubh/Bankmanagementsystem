package com.cog.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.ScheduleTraining;
import com.cognizant.entity.TrainerInfo;
import com.cognizant.service.ScheduleTrainingService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class ScheduleTrainingTest {
	
	@Autowired
	ScheduleTrainingService scheduleTrainingService;
	
	ScheduleTraining sTraining;
	TrainerInfo trainerInfo;
	

	//@Test
	public void insertTrainerInfo(){
		TrainerInfo trainerInfo=new TrainerInfo(123458,"Sunil","SRM Unversity","Spring");
		System.out.println("in test"+trainerInfo);
		scheduleTrainingService.insertTrainerInfo(trainerInfo);
		System.out.println("out test"+trainerInfo);
		assertTrue(true);
	}
	
	@Test
	public void insertScheduleTraining(){
		int TrainerId=123456;
		ScheduleTraining sTraining=new ScheduleTraining(1,2);
		scheduleTrainingService.insertScheduleTraining(TrainerId,sTraining);
		
	}

}
