//package com.zhongwang.cloud.platform.service.datasource;
//
//import com.zhongwang.cloud.platform.service.datasource.dynamic.DynamicDataSource;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Author :  zhujinhua
// * @Date : 2018-01-05 14:02
// */
//@Configuration
//public class DataSourceConfig {
//
//	@Bean(name = "firstDS")
//	@ConfigurationProperties(prefix = "first.datasource") // application.properteis中对应属性的前缀
//	public DataSource dataSource1() {
//		return DataSourceBuilder.create().build();
//	}
//
//	@Bean(name = "secondDS")
//	@ConfigurationProperties(prefix = "second.datasource") // application.properteis中对应属性的前缀
//	public DataSource dataSource2() {
//		return DataSourceBuilder.create().build();
//	}
//
//	/**
//	 * 动态数据源: 通过AOP在不同数据源之间动态切换
//	 *
//	 * @return
//	 */
//	@Bean(name = "firstDS")
//	public DataSource dataSource() {
//		DynamicDataSource dynamicDataSource = new DynamicDataSource();
//		// 默认数据源
//		dynamicDataSource.setDefaultTargetDataSource(dataSource1());
//		// 配置多数据源
//		Map<Object, Object> dsMap = new HashMap(5);
//		dsMap.put("first.datasource", dataSource1());
//		dsMap.put("second.datasource", dataSource2());
//		dynamicDataSource.setTargetDataSources(dsMap);
//
//		return dynamicDataSource;
//	}
//}
