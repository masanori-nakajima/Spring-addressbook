package example.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

@Configuration
public class AppConfig {
	@Value("${datasource.driver-class-name}")
	String driverClassName;
	@Value("{datasource.url}")
	String url;
	@Value("${datasource.username}")
	String username;
	@Value("${datasource.password}")
	String password;
	
	@Bean(destroyMethod = "close")
	DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
		
	}
	
	@Bean
	public static MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		//クラスパス上に格納されているプロパティファイル（拡張子は除く）　を指定する
		messageSource.setBasenames("message");
		messageSource.setDefaultEncoding("UTF-8");
		return (MessageSource) messageSource;
		
	
	}

}

