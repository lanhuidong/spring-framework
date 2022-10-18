package com.nexusy.context.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author lanhuidong
 * @since 2022-10-05
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
}
