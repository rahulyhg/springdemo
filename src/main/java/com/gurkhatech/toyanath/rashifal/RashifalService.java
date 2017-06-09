package com.gurkhatech.toyanath.rashifal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RashifalService {

	@Autowired
	DailyRashifalRepository dailyRepo;
	@Autowired
	WeeklyRashifalRepository weeklyRepo;
	@Autowired
	MonthlyRashifalRepository monthlyRepo;
	@Autowired
	YearlyRashifalRepository yearlyRepo;

	

	public List<DailyRashifalEntity> getDailyAll(int year, int month, int day) {
		List<DailyRashifalEntity> rashiList = new ArrayList<DailyRashifalEntity>();
		dailyRepo.findAll().forEach(rashiList::add);
		return rashiList;
	}
	public DailyRashifalEntity getDaily( String id, int year, int month, int day) {
		return dailyRepo.findOne(id);
	}
	public void addDaily(DailyRashifalEntity entity) {
		dailyRepo.save(entity);
	}
	public void addDailyAll(List<DailyRashifalEntity> entityList) {
		for(int i=0;i<entityList.size();i++){
			dailyRepo.save(entityList.get(i));
		}
	}

	public void updateDaily(DailyRashifalEntity entity) {
		dailyRepo.save(entity);
	}
	
	public void updateDailyAll(List<DailyRashifalEntity> rashifalList){
		for(int i=0;i<rashifalList.size();i++){
			updateDaily(rashifalList.get(i));
		}
	}
	public void deleteDaily(DailyRashifalEntity entity ) {
		dailyRepo.delete(entity);
	}
	
	public void deleteDailyAll(List<DailyRashifalEntity> entityList ) {
		for(int i=0;i<entityList.size();i++){
			dailyRepo.delete(entityList.get(i));
		}
	}
	public void deleteDailyAllByDay(int year,int month, int day){
		for(int i=1;i<=12;i++){
			deleteDailyByDay(i+"", year, month, day);
		}
	}
	
	public void deleteDailyByDay(String id,int year,int month, int day){
		dailyRepo.delete(id);
	}
	public void deleteDailyAll(){
		dailyRepo.deleteAll();
	}
	public List<WeeklyRashifalEntity> getWeeklyAll(int yr, int month, int day) {
		List<WeeklyRashifalEntity> rashiList = new ArrayList<WeeklyRashifalEntity>();
		weeklyRepo.findAll().forEach(rashiList::add);
		return rashiList;
	}
	public WeeklyRashifalEntity getWeekly(String id, int year, int month, int day) {
		return weeklyRepo.findOne(id);
	}
	public void addWeeklyAll(List<WeeklyRashifalEntity> entityList) {
		for(int i=0;i<entityList.size();i++){
			addWeekly(entityList.get(i));
		}
	}
	public void addWeekly(WeeklyRashifalEntity entity){
		weeklyRepo.save(entity);
	}
	public void updateWeeklyAll(List<WeeklyRashifalEntity> entityList) {
		for (int i=0;i<entityList.size();i++){
			updateWeekly(entityList.get(i));
		}
	}
	public void updateWeekly(WeeklyRashifalEntity entity){
		weeklyRepo.save(entity);
	}
	public void deleteWeeklyAll(List<WeeklyRashifalEntity> entityList) {
		for(int i=0;i<entityList.size();i++){
			deleteWeekly(entityList.get(i));
		}
	}
	
	public void deleteWeekly(WeeklyRashifalEntity entity){
		weeklyRepo.delete(entity);
	}
	public void deleteWeeklyAllByDay(int year, int month, int day) {
		for(int i=1;i<=12;i++){
			deleteWeeklyByDay(i+"", year, month, day);
		}
		
	}
	public void deleteWeeklyByDay(String id, int year,int month, int day){
		weeklyRepo.delete(id);
	}

}
