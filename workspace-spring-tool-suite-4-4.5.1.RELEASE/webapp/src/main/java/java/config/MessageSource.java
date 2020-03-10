package java.config;

import java.util.Locale;

import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;


public interface MessageSource {
	String getMessage(String code, Object[] args, Locale locale)
			throws NoSuchMessageException;
	String getMessage(String code, Object[] args, String defaultMessage, Locale locale);
	String getMessage(MessageSourceResolvable resolvable, Locale locale)
			throws NoSuchMessageException;
	
	@Bean
	public static MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		//クラスパス上に格納されているプロパティファイル（拡張子は除く）　を指定する
		messageSource.setBasenames("message");
		messageSource.setDefaultEncoding("UTF-8");
		return (MessageSource) messageSource;
		
	
	}
	
		
}