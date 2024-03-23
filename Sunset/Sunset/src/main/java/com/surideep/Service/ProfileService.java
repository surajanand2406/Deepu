package com.surideep.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surideep.Dto.Movie;
import com.surideep.Repository.MovieRepo;

@Service
public class ProfileService {
	
	@Autowired
	private MovieRepo movieRepo;
	
	public List<Movie> findMovie() {
		
		List<Movie> movie = new ArrayList<>();
		Movie mov = new Movie();
		mov.setId(1);
		mov.setName("Titanic");
		mov.setDirector("Suraj");
		mov.setYear("2001");
		mov.setBudget(10000);
		
		movie.add(mov);
		return movie;
//		return movieRepo.findAll();
	}
	

}
