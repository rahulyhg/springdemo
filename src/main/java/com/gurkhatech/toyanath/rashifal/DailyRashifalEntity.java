package com.gurkhatech.toyanath.rashifal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.dom4j.tree.AbstractEntity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class DailyRashifalEntity {

	@Id
	private String id;
	private String rashifal;
	private int yr;
	private int month;
	private int day;

	public DailyRashifalEntity(String id, String rashifal, int yr, int month, int day) {
		super();
		this.id = id;
		this.rashifal = rashifal;
		this.yr = yr;
		this.month = month;
		this.day = day;
	}

	private DailyRashifalEntity() {
		super();
	}

}
