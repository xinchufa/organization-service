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
//@MapperScan(basePackages = {"titan.mapper"}, sqlSessionFactoryRef = "sqlSessionFactoryFirst")
//public class MybatisDbFirstConfig {
//
//	@Autowired
//	@Qualifier("firstDS")
//	private DataSource firstDS;
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactoryFirst() throws Exception {
//		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//		factoryBean.setDataSource(firstDS); // 使用firstDS数据源, 连接firstDS库
//		return factoryBean.getObject();
//
//	}
//
//	@Bean
//	public SqlSessionTemplate sqlSessionTemplateFirst() throws Exception {
//		SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryFirst()); // 使用上面配置的Factory
//		return template;
//	}
//
//}
