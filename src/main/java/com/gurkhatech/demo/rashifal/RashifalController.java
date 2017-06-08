package com.gurkhatech.demo.rashifal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gurkhatech.demo.rashifal.test.TestThing;

@RestController
public class RashifalController {

	@Autowired
	private RashifalService service;

	@RequestMapping("rashifal/hey")
	public String sayHey() {
		return service.getGreetingMessage();
	}

	/*''
	 * @RequestMapping("rashifal/alldaily") public List<DailyRashifalModel>
	 * getAllDailyRashifal() { return service.getAllDaily(2013, 1, 1); }
	 */
	@RequestMapping("rashifal/daily")
	public DailyRashifalModel getDailyRashifal() {
		DailyRashifalModel drm = service.getDaily(3+"");
		if (drm != null) {
			System.out.println("!Not NULL");
			return drm;
		}
		System.out.println("NULL");
		return null;
	}

	@RequestMapping("rashifal/test")
	public TestThing test() {
		return service.getTest();
	}

}
