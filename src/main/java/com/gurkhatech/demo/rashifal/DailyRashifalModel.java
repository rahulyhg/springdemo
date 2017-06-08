package com.gurkhatech.demo.rashifal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DailyRashifalModel {

	@Id
	private int id;
	private String rashifal;
	private int year;
	private int month;
	private int day;

	public DailyRashifalModel(int id, String rashifal, int year, int month, int day) {
		super();
		this.id = id;
		this.rashifal = rashifal;
		this.year = year;
		this.month = month;
		this.day = day;
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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
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
		DailyRashifalModel other = (DailyRashifalModel) obj;
		if (day != other.day)
			return false;
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
