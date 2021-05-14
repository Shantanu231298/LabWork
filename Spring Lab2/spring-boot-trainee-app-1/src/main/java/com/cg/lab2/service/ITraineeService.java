package com.cg.lab2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.lab2.exception.TraineeException;
import com.cg.lab2.model.TraineeModel;

@Service
public interface ITraineeService {
	public TraineeModel addTrainee(TraineeModel Trainee) throws TraineeException;

	public TraineeModel updateTrainee(TraineeModel Trainee) throws TraineeException;

	public boolean removeTrainee(Long TraineeId) throws TraineeException;

	public TraineeModel viewTraineeByName(String Name) throws TraineeException;

	public TraineeModel viewTraineeById(Long TraineeId) throws TraineeException;

	public List<TraineeModel> viewAllTrainees() throws TraineeException;

}
