package com.gurkhatech.demo.rashifal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurkhatech.demo.rashifal.test.TestThing;
import com.gurkhatech.demo.rashifal.test.TestThingRepo;

@Service
public class RashifalService {
	
	@Autowired	DailyRashifalRepository dailyRepo;
	@Autowired	WeeklyRashifalRepository weeklyRepo;
	@Autowired	MonthlyRashifalRepository monthlyRepo;
	@Autowired	YearlyRashifalRepository yearlyRepo;
	@Autowired TestThingRepo testRepo;
	
	public String getGreetingMessage(){
		return "Hey yo man";
	}
	
	public DailyRashifalModel getDaily(int year,int month,int day,int rashi){
		return dailyRepo.findOne(null);
	}
	
	public List<DailyRashifalModel> getAllDaily(int year,int month,int day){
		List<DailyRashifalModel> rashiList = new ArrayList<DailyRashifalModel>();
		//dailyRepo.findAll();//.forEach(rashiList::add);
//		rashiList.add(dailyRepo.findOne(year));
		return rashiList;
	}
	
	public DailyRashifalModel getDaily(String id ){
		return dailyRepo.findOne(id+"");
	}
	
	public TestThing getTest(){
		return testRepo.findOne("i");
	}
	
}
