package com.cg.lab2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lab2.entity.TraineeEntity;
import com.cg.lab2.exception.TraineeException;
import com.cg.lab2.model.TraineeModel;
import com.cg.lab2.repo.ITraineeRepository;

@Service
public class TraineeServiceImpl implements ITraineeService {
	public static final String NOT_FOUND = "no Trainee with id # ";
	public static final String PRESENT = " present";
	
	@Autowired
	private ITraineeRepository itraineerepo;

	@Autowired
	private EMParser parser;

	public TraineeServiceImpl() {
		// default
	}

	public TraineeServiceImpl(ITraineeRepository itraineerepo) {
		super();
		this.itraineerepo = itraineerepo;
		this.parser = new EMParser();
	}
	
	@Override
	public TraineeModel addTrainee(TraineeModel Trainee) throws TraineeException {
		if (Trainee != null) {
			if (itraineerepo.existsById(Trainee.getTraineeid())) {
				throw new TraineeException("movie with this id already exists");
			} else {
				Trainee = parser.parse(itraineerepo.save(parser.parse(Trainee)));
			}
		}
		return Trainee;
	}

	@Override
	public TraineeModel updateTrainee(TraineeModel Trainee) throws TraineeException {
		if (Trainee != null) {
			if (!itraineerepo.existsById(Trainee.getTraineeid())) {
				throw new TraineeException("movie with this id already exists");
			} else {
				Trainee = parser.parse(itraineerepo.save(parser.parse(Trainee)));
			}
		}
		return Trainee;

	}
	@Override
	public boolean removeTrainee(Long TraineeId) throws TraineeException {
		TraineeEntity trainee = itraineerepo.findById(TraineeId).orElse(null);
		if (trainee == null) {
			throw new TraineeException(NOT_FOUND + TraineeId + PRESENT);
		} else {
			itraineerepo.deleteById(TraineeId);
			return true;
		}

	}
	@Override
	public TraineeModel viewTraineeByName(String Name) throws TraineeException {
		TraineeEntity trainee = itraineerepo.findBytraineename(Name);
		if (trainee == null) {
			throw new TraineeException("no trainee with name " + Name + PRESENT);
		} else {
			return parser.parse(itraineerepo.findById(trainee.getTraineeid()).orElse(null));
		}
	}
	@Override
	public TraineeModel viewTraineeById(Long TraineeId) throws TraineeException {
		TraineeEntity trainee = itraineerepo.findById(TraineeId).orElse(null);
		if (trainee == null) {
			throw new TraineeException("no trainee with id # " + TraineeId + PRESENT);
		}
		return parser.parse(itraineerepo.findById(TraineeId).get());

	}
	@Override
	public List<TraineeModel> viewAllTrainees() throws TraineeException {
		return itraineerepo.findAll().stream().map(parser::parse).collect(Collectors.toList());

	}

}
