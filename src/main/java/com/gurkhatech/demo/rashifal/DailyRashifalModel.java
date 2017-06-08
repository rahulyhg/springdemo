package com.gurkhatech.demo.rashifal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.dom4j.tree.AbstractEntity;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class DailyRashifalModel {

	@Id
	private String id;
	private String rashifal;
	private int yr;
	private int month;
	private int day;


}
