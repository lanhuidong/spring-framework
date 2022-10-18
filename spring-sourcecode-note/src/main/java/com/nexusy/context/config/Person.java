package com.nexusy.context.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lanhuidong
 * @since 2022-10-18
 */
@Component
public class Person {

	@Value("${name}")
	private String name;

	@Autowired
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
