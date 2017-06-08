package com.gurkhatech.toyanath.rashifal;

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
	
	public DailyRashifalEntity getDaily(int year,int month,int day,int rashi){
		return dailyRepo.findOne(null);
	}
	
	public List<DailyRashifalEntity> getAllDaily(int year,int month,int day){
		List<DailyRashifalEntity> rashiList = new ArrayList<DailyRashifalEntity>();
		return rashiList;
	}
	
	public DailyRashifalEntity getDaily(String id ){
		dailyRepo.save(new DailyRashifalEntity("1", "aaaja mashu vat khana paine yog chha", 2074, 1, 2));
		return dailyRepo.findOne(id+"");
	}
	
	
}
