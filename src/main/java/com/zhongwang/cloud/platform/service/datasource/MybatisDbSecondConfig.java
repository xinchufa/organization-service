//package com.zhongwang.cloud.platform.service.datasource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
///**
// * @Author :  zhujinhua
// * @Date : 2018-01-05 14:05
// */
//@Configuration
//@MapperScan(basePackages = {"titan.mapper"}, sqlSessionFactoryRef = "sqlSessionFactorySecond")
//public class MybatisDbSecondConfig {
//
//	@Autowired
//	@Qualifier("secondDS")
//	private DataSource secondDS;
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactorySecond() throws Exception {
//		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//		factoryBean.setDataSource(secondDS); // 使用secondDS数据源, 连接secondDS库
//		return factoryBean.getObject();
//
//	}
//
//	@Bean
//	public SqlSessionTemplate sqlSessionTemplateSecond() throws Exception {
//		SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactorySecond()); // 使用上面配置的Factory
//		return template;
//	}
//
//}
