package property;

import java.util.ResourceBundle;

public class Check1 {

	
	public static void main(String[] args) {
		any();
	}
	public static void any()
	{
		ResourceBundle rb =ResourceBundle.getBundle("OR1");
		String string = rb.getString("Register");
		System.out.println(string);
	}
}
