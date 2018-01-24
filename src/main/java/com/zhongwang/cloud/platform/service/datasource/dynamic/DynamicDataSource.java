//package com.zhongwang.cloud.platform.service.datasource.dynamic;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//
///**
// * @Author :  zhujinhua
// * @Date : 2018-01-05 15:16
// */
//public class DynamicDataSource extends AbstractRoutingDataSource {
//
//	private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);
//
//
//	@Override
//	protected Object determineCurrentLookupKey() {
//
//		log.debug("数据源为{}", DataSourceContextHolder.getDB());
//
//		return DataSourceContextHolder.getDB();
//	}
//
//}
