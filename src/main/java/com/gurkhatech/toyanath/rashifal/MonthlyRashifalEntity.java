package com.gurkhatech.toyanath.rashifal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthlyRashifalEntity {
	@Id
	private String id;
	private String rashifal;
	private int yr;
	private int month;
	
	
}