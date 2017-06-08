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

	@RequestMapping("rashifal/daily/{id}")
	public DailyRashifalEntity getDailyRashifal(@PathVariable String id) {
		return service.getDaily(2017, 2, 3, id);
	}

	@RequestMapping("rashifal/daily")
	public List<DailyRashifalEntity> getDailyRashifalAll() {
		return service.getDailyAll(2017, 2, 3);
	}

	@RequestMapping(method = RequestMethod.POST, value = "rashifal/daily")
	public void addRashifalAll(@RequestBody List<DailyRashifalEntity> entityList) {
		service.addDailyAll(entityList);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "rashifal/daily/")
	public void updateRashifalAll(@RequestBody List<DailyRashifalEntity> entityList) {
		service.updateAll(entityList);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/daily/delete_all")
	public void deleteDailyAll(@RequestBody List<DailyRashifalEntity> entityList) {
		service.deleteDailyAll(entityList);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/daily/delete_all_by_day")
	public void deleteDailyAllByDay(@PathVariable("year") int year, @PathVariable("month") int month,
			@PathVariable("day") int day) {
		service.deleteDailyAllByDay(year, month, day);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "rashifal/daily/delete_by_day")
	public void deleteDailyByDay( @PathVariable("year") int year,
			@PathVariable("month") int month, @PathVariable("day") int day,@PathVariable("id") String id) {
		service.deleteDailyByDay(year, month, day, id);
	}

}
