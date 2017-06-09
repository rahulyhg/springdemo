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
	
	public void updateAll(List<DailyRashifalEntity> rashifalList){
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
		// TODO use query for a single day dailyRepo.deleteAll();
		dailyRepo.delete(id);
	}
	public void deleteDailyAll(){
		dailyRepo.deleteAll();
	}

}
