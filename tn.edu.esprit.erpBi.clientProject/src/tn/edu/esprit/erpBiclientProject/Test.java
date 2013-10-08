package tn.edu.esprit.erpBiclientProject;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context=new InitialContext();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
