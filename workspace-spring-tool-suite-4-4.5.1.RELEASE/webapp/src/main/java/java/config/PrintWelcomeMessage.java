package java.config;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;

public class PrintWelcomeMessage {
@Autowired
MessageSource messageSource; //インジェクションする

	public void printWelcomeMessage() {
		//getMessageメソッドの呼び出し
		String message = messageSource.getMessage(
			"result.succed",new String[] {"ユーザー登録"}
				, Locale.JAPANESE);
	
		System.out.println(message);
	}
}
