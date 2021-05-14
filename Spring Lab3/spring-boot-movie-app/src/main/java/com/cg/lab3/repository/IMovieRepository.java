package com.cg.lab3.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.lab3.entities.MovieEntity;



@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Long>{
	
	MovieEntity findByCategory(String category);

}
