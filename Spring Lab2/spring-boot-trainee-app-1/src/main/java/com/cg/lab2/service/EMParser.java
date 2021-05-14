package com.cg.lab2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lab2.entity.TraineeEntity;
import com.cg.lab2.model.TraineeModel;
import com.cg.lab2.repo.ITraineeRepository;


@Service
public class EMParser {

	@Autowired
	private ITraineeRepository itraineerepo;

	public EMParser() {
		// default
	}

	public EMParser(ITraineeRepository itraineerepo) {
		super();
		this.itraineerepo = itraineerepo;
	}

	/*
	 * entity to model
	 */
	public TraineeModel parse(TraineeEntity source) {
		return source == null ? null
				: new TraineeModel(source.getTraineeid(), source.getTraineename(), source.getTraineedomain(),
						source.getTraineelocation());
	}

	/*
	 * model to entity
	 */
	public TraineeEntity parse(TraineeModel source) {
		return source == null ? null
				: new TraineeEntity(source.getTraineeid(), source.getTraineename(), source.getTraineedomain(),
						source.getTraineelocation());
	}
}
