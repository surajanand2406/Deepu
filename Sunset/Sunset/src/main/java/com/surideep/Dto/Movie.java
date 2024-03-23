package com.surideep.Dto;

public class Movie {
	
	int id;
	String name;
	String year;
	String director;
	int budget;
	public Movie(int id, String name, String year, String director, int budget) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.director = director;
		this.budget = budget;
	}
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", year=" + year + ", director=" + director + ", budget=" + budget
				+ "]";
	}
	
	

}
