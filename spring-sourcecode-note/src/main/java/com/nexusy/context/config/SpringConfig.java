package com.nexusy.context.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lanhuidong
 * @since 2022-10-05
 */
@Configuration
@ComponentScan
public class SpringConfig {

	@Bean
	public Object bean(){
		return new Object();
	}

}
