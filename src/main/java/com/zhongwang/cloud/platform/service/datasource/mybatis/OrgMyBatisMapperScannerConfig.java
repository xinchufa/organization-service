//package com.zhongwang.cloud.platform.service.datasource.mybatis;
//
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.AutoConfigureOrder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import tk.mybatis.spring.mapper.MapperScannerConfigurer;
//
//import java.util.Properties;
//
//// 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
////@AutoConfigureAfter(OrgMyBatisConfig.class)
//@AutoConfigureOrder(Ordered.LOWEST_PRECEDENCE)
//@Configuration(OrgMyBatisMapperScannerConfig.ORG_MYBATIS_MAPPER_SCANNER_CONFIG)
//public class OrgMyBatisMapperScannerConfig {
//
//	public static final String ORG_DAO_PACKAGES = "com.zhongwang.cloud.platform.service.organization.dao";
//
//	public static final String ORG_MYBATIS_MAPPER_SCANNER_CONFIG = "orgMyBatisMapperScannerConfig";
//
//	public static final String ORG_MAPPER_SCANNER_CONFIGURER = "orgMapperScannerConfigurer";
//
//	@Bean(ORG_MAPPER_SCANNER_CONFIGURER)
//	public MapperScannerConfigurer mapperScannerConfigurer() {
//		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//		mapperScannerConfigurer.setSqlSessionFactoryBeanName(OrgMyBatisConfig.ORG_SQL_SESSION_FACTORY);
//		mapperScannerConfigurer.setBasePackage(ORG_DAO_PACKAGES);
//		Properties properties = new Properties();
//		// 这里要特别注意，不要把MyMapper放到 basePackage 中，也就是不能同其他Mapper一样被扫描到。
//		properties.setProperty("mappers", "tk.mybatis.mapper.common.Mapper,com.zhongwang.common.mapper.ZWMapper");
//		mapperScannerConfigurer.setProperties(properties);
//		return mapperScannerConfigurer;
//	}
//}
