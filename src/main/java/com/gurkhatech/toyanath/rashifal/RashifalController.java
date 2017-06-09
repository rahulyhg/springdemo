package com.gurkhatech.toyanath.rashifal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RashifalController {

	@Autowired
	private RashifalService service;

	
	//Daily Rashifal API
	
	
	@RequestMapping("rashifal/daily")
	public List<DailyRashifalEntity> getDailyRashifalAll() {
		return service.getDailyAll(2017, 2, 3);
	}
	
	@RequestMapping("rashifal/daily/{id}")
	public DailyRashifalEntity getDailyRashifal(@PathVariable String id) {
		return service.getDaily(id,2017, 2, 3);
		 /*DailyRashifalEntity entity = new DailyRashifalEntity("3", "Ramro Din", 2074, 2, 28);
		 return entity;*/
	}

	@RequestMapping(method = RequestMethod.POST, value = "rashifal/daily")
	public void addRashifalAll(@RequestBody List<DailyRashifalEntity> entityList) {
		service.addDailyAll(entityList);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "rashifal/daily/")
	public void updateRashifalDailyAll(@RequestBody List<DailyRashifalEntity> entityList) {
		service.updateDailyAll(entityList);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/daily/delete_all")
	public void deleteDailyAll(@RequestBody List<DailyRashifalEntity> entityList) {
		service.deleteDailyAll(entityList);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/daily/delete_all_by_day/{year}/{month}/{day}")
	public void deleteDailyAllByDay(@PathVariable("year") int year, @PathVariable("month") int month,
			@PathVariable("day") int day) {
		service.deleteDailyAllByDay(year, month, day);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/daily/delete_by_day/{id}/{year}/{month}/{day}")
	public void deleteDailyByDay( @PathVariable("id") String id,@PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("day") int day) {
		service.deleteDailyByDay(id,year, month, day);
	}
	
	
	//Weekly Rashifal API

	@RequestMapping("rashifal/weekly")
	public List<WeeklyRashifalEntity> getWeeklyRashifalAll() {
		return service.getWeeklyAll(2017, 2, 3);
	}
	
	@RequestMapping("rashifal/weekly/{id}")
	public WeeklyRashifalEntity getWeeklyRashifal(@PathVariable String id) {
		return service.getWeekly(id,2017, 2, 3);
		 /*DailyRashifalEntity entity = new DailyRashifalEntity("3", "Ramro Din", 2074, 2, 28);
		 return entity;*/
	}

	@RequestMapping(method = RequestMethod.POST, value = "rashifal/weekly")
	public void addWeeklyAll(@RequestBody List<WeeklyRashifalEntity> entityList) {
		service.addWeeklyAll(entityList);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "rashifal/weekly")
	public void updateRashifalWeeklyAll(@RequestBody List<WeeklyRashifalEntity> entityList) {
		service.updateWeeklyAll(entityList);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/weekly/delete_all")
	public void deleteWeeklyAll(@RequestBody List<WeeklyRashifalEntity> entityList) {
		service.deleteWeeklyAll(entityList);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/weekly/delete_all_by_starting_day/{year}/{month}/{day}")
	public void deleteWeeklyAllByStartingDay(@PathVariable("year") int year, @PathVariable("month") int month,
			@PathVariable("day") int day) {
		service.deleteWeeklyAllByDay(year, month, day);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/daily/delete_by_starting_day/{id}/{year}/{month}/{day}")
	public void deleteWeeklyByStartingDay( @PathVariable("id") String id,@PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("day") int day) {
		service.deleteWeeklyByDay(id,year, month, day);
	}	
	
}
