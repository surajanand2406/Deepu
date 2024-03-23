package com.surideep.Controller;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surideep.Dto.Movie;
import com.surideep.Dto.ResponseDto;
import com.surideep.Service.ProfileService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/movieapi")
public class SpringPractice {
	
	@Autowired
	ProfileService profileService;
	
	@GetMapping("/getAllMovieList")
	public ResponseEntity<ResponseDto<List<Movie>>> getAllMovies(){
		
		ResponseDto<List<Movie>> res = new ResponseDto<>();
		List<Movie> data = profileService.findMovie().stream()
				.map(p -> new Movie(p.getId(),p.getName(),p.getYear(),p.getDirector(),p.getBudget())).collect(Collectors.toList());
		
		res.setData(data).setMessage("success").setStatus(true);
		return new ResponseEntity<ResponseDto<List<Movie>>>(res,HttpStatus.OK);
		
		
	}

}
