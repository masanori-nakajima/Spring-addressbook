package java.config;

public interface MessageSourceResolvable {
	String[] getCodes(); //複数のcodeを指定できる
	Object[] getArguments();
	String getDefaultMessage();
}
	

