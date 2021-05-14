package com.cg.lab3.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lab3.exception.MovieException;
import com.cg.lab3.model.MovieModel;
import com.cg.lab3.service.IMovieService;




@RestController
@RequestMapping(path="/movie")
public class MovieRestContoller {

	@Autowired
	private IMovieService movieService;
	

	@PostMapping
	public ResponseEntity<MovieModel>addMovie(@RequestBody MovieModel Movie)throws MovieException{
		Movie=movieService.addMovie(Movie);
		return new ResponseEntity<>(Movie, HttpStatus.CREATED);
	}
	
	
	@PutMapping
	public ResponseEntity<MovieModel> updateMovie(@RequestBody MovieModel Movie) throws MovieException {
		Movie = movieService.updateMovie(Movie);
		 return new ResponseEntity<>(Movie, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{movieId}")
	public ResponseEntity<Void> deleteMovie(@PathVariable("movieId") Long movieId) throws MovieException{
		ResponseEntity<Void> response = null;
		MovieModel movie = movieService.viewMovie(movieId);
		if (movie == null) {
			 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		} else {
			movieService.removeMovie(movieId);
			response = new ResponseEntity<>(HttpStatus.OK);
			
		}
		return response;
	}
	

	@GetMapping("/{category}")
	public ResponseEntity<MovieModel> viewMovie(@PathVariable("category") String category) throws MovieException {
		ResponseEntity<MovieModel> response = null;
		MovieModel movie = movieService.viewMovieByCategory(category);
		
		if (movie == null) {
			 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		} else {
			response = ResponseEntity.ok(movie);
		}
		return response;
	}
	
	@GetMapping
	public ResponseEntity<List<MovieModel>> viewAllMovies() throws MovieException {
		 return new ResponseEntity<>(movieService.viewAllMovies(), HttpStatus.OK);
		
	}
	
	
	
	
}