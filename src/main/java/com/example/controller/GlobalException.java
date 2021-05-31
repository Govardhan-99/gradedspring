package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> globalExceptionHandler(HttpServletRequest req,Exception e){
		System.out.println("RuntimeException occured::URL="+req.getUserPrincipal()+"raised"+e);
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.OK);
	}

}
