package com.nexusy.context;

import com.nexusy.context.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lanhuidong
 * @since 2022-10-05
 */
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(ctx.getBean("bean"));
	}

}
