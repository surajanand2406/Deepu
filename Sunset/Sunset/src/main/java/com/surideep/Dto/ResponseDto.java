package com.surideep.Dto;

public class ResponseDto<T> {
	
	private boolean status;
	private String message;
	private T data;
	
	public ResponseDto<T> setData(T data) {
		this.data = data;
		return this;
	}
	public ResponseDto<T> setStatus(boolean status){
		this.status = status;
		return this;
	}
	public ResponseDto<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	
	
	

}
