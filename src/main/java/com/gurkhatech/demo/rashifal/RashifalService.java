package com.gurkhatech.demo.rashifal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RashifalService {
	
	@Autowired	DailyRashifalRepository dailyRepo;
	@Autowired	WeeklyRashifalRepository weeklyRepo;
	@Autowired	MonthlyRashifalRepository monthlyRepo;
	@Autowired	YearlyRashifalRepository yearlyRepo;
	
	public String getGreetingMessage(){
		return "Hey yo man";
	}
	
	public DailyRashifalModel getDailyRashifal(int year,int month,int day,int rashi){
		return dailyRepo.findOne(rashi+"");
	}
	
}
