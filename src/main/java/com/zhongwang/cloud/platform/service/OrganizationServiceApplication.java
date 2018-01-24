package com.zhongwang.cloud.platform.service;

import com.zhongwang.cloud.platform.service.org.common.filter.CORSFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author :  zhujinhua
 * @Date : 2017-12-25 17:20
 */
@SpringBootApplication(
		exclude = {DataSourceAutoConfiguration.class}
)
//@EnableJpaRepositories(basePackages = { "com.zhongwang.cloud.platform.service.org.hr.repository"})
@ComponentScan(basePackages = "com.zhongwang")
//@EnableTransactionManagement
//@EnableCaching

public class OrganizationServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean MyFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new CORSFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("CORSFilter");
		registration.setOrder(1);
		return registration;
	}
}
