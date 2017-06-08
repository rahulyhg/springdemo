package com.gurkhatech.demo.rashifal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthlyRashifalModel {
	@Id
	private int id;
	private String rashifal;
	private int year;
	private int month;

	public MonthlyRashifalModel(int id, String rashifal, int year, int month) {
		super();
		this.id = id;
		this.rashifal = rashifal;
		this.year = year;
		this.month = month;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRashifal() {
		return rashifal;
	}

	public void setRashifal(String rashifal) {
		this.rashifal = rashifal;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + month;
		result = prime * result + ((rashifal == null) ? 0 : rashifal.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonthlyRashifalModel other = (MonthlyRashifalModel) obj;
		if (id != other.id)
			return false;
		if (month != other.month)
			return false;
		if (rashifal == null) {
			if (other.rashifal != null)
				return false;
		} else if (!rashifal.equals(other.rashifal))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
