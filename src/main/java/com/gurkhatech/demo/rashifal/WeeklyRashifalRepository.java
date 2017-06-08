package com.gurkhatech.demo.rashifal;

import org.springframework.data.repository.CrudRepository;

public interface WeeklyRashifalRepository extends CrudRepository<DailyRashifalModel, String> {

	
}
