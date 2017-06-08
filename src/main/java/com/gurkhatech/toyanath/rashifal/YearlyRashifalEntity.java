package com.gurkhatech.toyanath.rashifal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class YearlyRashifalEntity {
	@Id
	private int id;
	private String rashifal;
	private int yr;
}
