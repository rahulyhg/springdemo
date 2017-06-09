package com.gurkhatech.toyanath.rashifal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WeeklyRashifalEntity {
	@Id
	private String id;
	private String rashifal;
	private int yr;
	private int month;
	private int day;
	public WeeklyRashifalEntity(String id, String rashifal, int yr, int month, int day) {
		super();
		this.id = id;
		this.rashifal = rashifal;
		this.yr = yr;
		this.month = month;
		this.day = day;
	}
	
	private WeeklyRashifalEntity(){
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRashifal() {
		return rashifal;
	}
	public void setRashifal(String rashifal) {
		this.rashifal = rashifal;
	}
	public int getYr() {
		return yr;
	}
	public void setYr(int yr) {
		this.yr = yr;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + month;
		result = prime * result + ((rashifal == null) ? 0 : rashifal.hashCode());
		result = prime * result + yr;
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
		WeeklyRashifalEntity other = (WeeklyRashifalEntity) obj;
		if (day != other.day)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (month != other.month)
			return false;
		if (rashifal == null) {
			if (other.rashifal != null)
				return false;
		} else if (!rashifal.equals(other.rashifal))
			return false;
		if (yr != other.yr)
			return false;
		return true;
	}
	
	
}
