package com.example.bins;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class Teacher {
	private String subject;
	private String homework;
	private String tips;
	
}
