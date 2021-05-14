package com.cg.lab3.service;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lab3.entities.MovieEntity;
import com.cg.lab3.exception.MovieException;
import com.cg.lab3.model.MovieModel;
import com.cg.lab3.repository.IMovieRepository;



@Service	
public class MovieServiceImpl implements IMovieService{
	
	public static final String NOT_FOUND = "no movie with id #";
	public static final String PRESENT = " present";
	
	@Autowired
	private IMovieRepository movieRepo;
	
	@Autowired
	private EMParser parser;
	
	/*
	 * Default constructor
     */

	public MovieServiceImpl(){
	//default
	}
	
	/*
	 * Parameterized for assigning
	 */

	public MovieServiceImpl(IMovieRepository movieRepo) {
		super();
		this.movieRepo = movieRepo;
		this.parser = new EMParser();
	}

	
	@Transactional
	@Override
	public MovieModel addMovie(MovieModel movie) throws MovieException {
		if (movie != null) {
			if (movieRepo.existsById(movie.getMovieId())) {
				throw new MovieException("movie with this id already exists");
			}
			movie = parser.parse(movieRepo.save(parser.parse(movie)));
		}
		return movie;
	}



	@Transactional
	@Override
	public MovieModel updateMovie(MovieModel movie) throws MovieException {

		MovieEntity movie1 = movieRepo.findById(movie.getMovieId()).orElse(null);
		if (movie1 == null) {
			throw new MovieException(NOT_FOUND + movie.getMovieId() + PRESENT);
		}
		movie = parser.parse(movieRepo.save(parser.parse(movie)));
		return movie;
	}



	@Transactional
	@Override
	public boolean removeMovie(Long movieId) throws MovieException {
		boolean isDeleted = false;
		MovieEntity oldmovie = movieRepo.findById(movieId).orElse(null);
		if (oldmovie == null) {
			throw new MovieException(NOT_FOUND + movieId + PRESENT);
		} else {
			movieRepo.deleteById(movieId);
			isDeleted = true;
		}
		return isDeleted;

	}

	
	@Override
	public MovieModel viewMovieByCategory(String category) throws MovieException {
		MovieEntity oldMovie = movieRepo.findByCategory(category);
		if (oldMovie == null) {
			throw new MovieException("no movie with category " + category + PRESENT);
		}
		return parser.parse(movieRepo.findById(oldMovie.getMovieId()).orElse(null));
	}

	/*
	 * Implementation of viewmovie method to view a movie
	 */
	
	@Override
	public MovieModel viewMovie(Long movieId) throws MovieException {
		MovieEntity oldMovie = movieRepo.findById(movieId).orElse(null);
		if (oldMovie == null) {
			throw new MovieException("no movie with category " + movieId + PRESENT);
		}
		return parser.parse(movieRepo.findById(movieId).orElse(null));
	}

	
	/*
	 * Implementation of viewAllmovies method to view all movies
	 */

	@Override
	public List<MovieModel> viewAllMovies() throws MovieException {

		return movieRepo.findAll().stream().map(parser::parse).collect(Collectors.toList());

	}

}