package com.cg.lab3.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lab3.entities.MovieEntity;
import com.cg.lab3.model.MovieModel;
import com.cg.lab3.repository.IMovieRepository;


@Service
public class EMParser {
	
	@Autowired
	private IMovieRepository movieRepo;
	
	public EMParser(){
		
	}


	public EMParser(IMovieRepository movieRepo) {
		super();
		this.movieRepo = movieRepo;
	}




	public MovieModel parse(MovieEntity source) {
		return source==null ? null:
			new MovieModel(source.getMovieId(),source.getMovieName(),source.getCategory(),source.getDuration(),source.getTicket());
	}
	
	/*
	 * Method to parse Model to Entity
     */
	
	public MovieEntity parse(MovieModel source) {
		return source==null ? null:
			new MovieEntity(source.getMovieId(),source.getMovieName(),source.getCategory(),source.getDuration(),source.getTicket());
	}

}
