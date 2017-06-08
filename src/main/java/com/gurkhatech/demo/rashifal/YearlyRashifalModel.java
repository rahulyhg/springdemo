package com.gurkhatech.demo.rashifal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class YearlyRashifalModel {
	@Id
	private int id;
	private String rashifal;
	private int year;

	public YearlyRashifalModel(int id, String rashifal, int year) {
		super();
		this.id = id;
		this.rashifal = rashifal;
		this.year = year;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		YearlyRashifalModel other = (YearlyRashifalModel) obj;
		if (id != other.id)
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
