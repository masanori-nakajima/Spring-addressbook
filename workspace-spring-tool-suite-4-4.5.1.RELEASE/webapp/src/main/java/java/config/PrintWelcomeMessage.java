package java.config;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;

public class PrintWelcomeMessage {
@Autowired
MessageSource messageSource; //�C���W�F�N�V��������

	public void printWelcomeMessage() {
		//getMessage���\�b�h�̌Ăяo��
		String message = messageSource.getMessage(
			"result.succed",new String[] {"���[�U�[�o�^"}
				, Locale.JAPANESE);
	
		System.out.println(message);
	}
}
