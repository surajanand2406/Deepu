package com.surideep.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surideep.Dto.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {
	
	List<Movie> findAll();

}
