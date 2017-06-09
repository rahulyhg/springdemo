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
		//TODO Find the way to make query.
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
		//TODO find method to update a touple
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
		// TODO use query for a single day dailyRepo.deleteAll();
	}
	
	public void deleteDailyByDay(int year,int month, int day,String id){
		// TODO use query for a single day dailyRepo.deleteAll();
	}
	public void deleteDailyAll(){
		dailyRepo.deleteAll();
	}

}
