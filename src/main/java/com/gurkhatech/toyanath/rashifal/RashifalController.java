package com.gurkhatech.toyanath.rashifal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RashifalController {

	@Autowired
	private RashifalService service;

	@RequestMapping("rashifal/daily")
	public DailyRashifalEntity getDailyRashifal() {
		DailyRashifalEntity drm = service.getDaily(3+"");
		if (drm != null) {
			System.out.println("!Not NULL");
			return drm;
		}
		System.out.println("NULL");
		return null;
	}


}
