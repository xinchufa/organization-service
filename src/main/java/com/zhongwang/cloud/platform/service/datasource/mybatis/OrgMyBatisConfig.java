package com.zhongwang.cloud.platform.service.datasource.mybatis;

import com.zhongwang.common.mapper.ZWMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author :  zhujinhua
 * @Date : 2018-01-16 16:36
 */
@Configuration
//@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
@MapperScan(basePackages = OrgMyBatisConfig.ORG_DAO_PACKAGES, markerInterface = ZWMapper.class, sqlSessionFactoryRef = OrgMyBatisConfig.ORG_SQL_SESSION_FACTORY)
public class OrgMyBatisConfig {
	
	public static final String ORG_DAO_PACKAGES = "com.zhongwang.cloud.platform.service.organization.dao";
	public static final String ORG_DATA_SOURCE = "orgDataSource";
	public static final String ORG_SQL_SESSION_FACTORY = "orgSqlSessionFactory";
	public static final String ORG_SQL_SESSION_TEMPLATE = "orgSqlSessionTemplate";
	public static final String ORG_DATA_SOURCE_TRANSACTION_MANAGER = "orgDataSourceTransactionManager";
	
	/**
	 * 创建数据源
	 *
	 * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
	 */
	@Bean(ORG_DATA_SOURCE)
	@ConfigurationProperties(prefix = "org.datasource") // application.properteis中对应属性的前缀
	public DataSource getDataSource() throws Exception {
		return DataSourceBuilder.create().build();
	}
	
	/**
	 * 根据数据源创建SqlSessionFactory
	 */
	@Bean(ORG_SQL_SESSION_FACTORY)
	public SqlSessionFactory orgSqlSessionFactory(@Qualifier(ORG_DATA_SOURCE) DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);// 指定数据源(这个必须有，否则报错)
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("/org-mybatis-config.xml"));
		// 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
		sqlSessionFactoryBean.setTypeAliasesPackage("com.zhongwang.cloud.platform.service.organization.domain");// 指定基包 typeAliasesPackage可以配置多个值，用,;\t\n进行分割。但是不支持Ant风格的路径
		//sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/zhongwang/org/**/*Mapper.xml"));// 指定xml文件位置
		sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/**/*Mapper.xml"));// 指定xml文件位置
		return sqlSessionFactoryBean.getObject();
	}
	
	
	@Bean(ORG_SQL_SESSION_TEMPLATE)
	public SqlSessionTemplate orgSqlSessionTemplate(@Qualifier(ORG_DATA_SOURCE) DataSource dataSource) throws Exception {
		SqlSessionTemplate template = new SqlSessionTemplate(orgSqlSessionFactory(dataSource)); // 使用上面配置的Factory
		return template;
	}
	
	@Bean(ORG_DATA_SOURCE_TRANSACTION_MANAGER)
//	@ConditionalOnMissingBean
	public DataSourceTransactionManager orgTransactionManager(@Qualifier(ORG_DATA_SOURCE) DataSource dataSource) throws Exception {
		return new DataSourceTransactionManager(dataSource);
	}
	
}
