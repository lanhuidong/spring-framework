package com.nexusy.context.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lanhuidong
 * @since 2022-10-12
 */
@Component
public class Car {

	private String name;

	public Car(@Value("${name:byd}") String name) {
		this.name = name;
	}

	public Car(@Value("${name:t}")String name, @Value("${name:20}")Double price) {

	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				'}';
	}
}
