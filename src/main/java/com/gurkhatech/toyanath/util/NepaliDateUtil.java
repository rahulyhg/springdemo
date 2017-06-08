package com.gurkhatech.toyanath.util;

public class NepaliDateUtil {

	private final int TYPE_NP = 0;
	private final int TYPE_EN = 1;

	int yearNp;
	int monthNp;
	int dayNp;
	int yearEn;
	int monthEn;
	int dayEn;

	public static NepaliDateUtil initWithNepaliDate(int year, int month, int day) {
		return new NepaliDateUtil(CalendarType.NEPALI, year, month, day);
	}

	public static NepaliDateUtil initWithEnglishDate(int year, int month, int day) {
		return new NepaliDateUtil(CalendarType.ENGLISH, year, month, day);

	}

	private NepaliDateUtil(CalendarType type, int year, int month, int day) {
		if (type == CalendarType.ENGLISH) {
			this.yearEn = year;
			this.monthEn = month;
			this.dayEn = day;
		}
		if (type == CalendarType.NEPALI) {
			this.yearNp = year;
			this.monthNp = month;
			this.dayNp = day;
		}
	}

	private enum CalendarType {
		ENGLISH, NEPALI
	}
	
	
	public int getNepaliDay(){
		return dayNp;
	}
}
