//package com.mybatis.plus.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
///**
// * @author 王伟鑫
// * @version 0.1v
// * @create 2018-01-10 16:57
// * @see
// **/
//@Configurable
//public class DruidDBConfig {
//	private Logger logger = LoggerFactory.getLogger(DruidDBConfig.class);
//
//	@Value("${master.datasource.driverClassName}")
//	private String driverClass;
//
//	@Value("${master.datasource.url}")
//	private String url;
//
//	@Value("${master.datasource.username}")
//	private String username;
//
//	@Value("${master.datasource.password}")
//	private String password;
//
//	@Bean
//	@Primary
//	public DataSource dataSource() {
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setDriverClassName(driverClass);
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
//		return dataSource;
//	}
//
//}
