package java.config;

public interface MessageSourceResolvable {
	String[] getCodes(); //������code���w��ł���
	Object[] getArguments();
	String getDefaultMessage();
}
	

