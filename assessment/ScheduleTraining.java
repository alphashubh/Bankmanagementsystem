package com.cognizant.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Schedule_Training")
public class ScheduleTraining {


	@Id
	@Column(name="SCHEDULE_ID")
	int scheduleId;

	@Column(name="START_DATE")
	Date startDate;
	
	@Column(name="DURATION")
	int duration;
	
	@ManyToOne()
	@JoinColumn(name="TRAINER_ID")
	private TrainerInfo trainerInfo;
	
	

	public int getScheduleId() {
		return scheduleId;
	}



	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public TrainerInfo getTrainerInfo() {
		return trainerInfo;
	}



	public void setTrainerInfo(TrainerInfo trainerInfo) {
		this.trainerInfo = trainerInfo;
	}



	public ScheduleTraining() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ScheduleTraining(int scheduleId, Date startDate, int duration, TrainerInfo trainerInfo) {
		super();
		this.scheduleId = scheduleId;
		this.startDate = startDate;
		this.duration = duration;
		this.trainerInfo = trainerInfo;
	}



	



	public ScheduleTraining(int scheduleId, int duration) {
		super();
		this.scheduleId = scheduleId;
		this.duration = duration;
	}



	@Override
	public String toString() {
		return "ScheduleTraining [scheduleId=" + scheduleId + ", startDate=" + startDate + ", duration=" + duration
				+ ", trainerInfo=" + trainerInfo + "]";
	}

	
	
	
}
