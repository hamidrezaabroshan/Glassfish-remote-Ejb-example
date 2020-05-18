package com.ejb.client.example;
import java.util.List;
import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.InitialContext;

import com.hamid.test.Greeting;

import jdk.nashorn.internal.runtime.Context;

public class Main {
	public static void main(String[] args) {
		System.out.println("test");
		try {
			String host="localhost";
			String port ="3700";
			Properties prop = new Properties();
			prop.put("org.omg.CORBA.ORBInitialHost",host);
			prop.put("org.omg.CORBA.ORBInitialPort",port);
			InitialContext context =new InitialContext(prop);
			Greeting greeting =(Greeting) context.doLookup("java:global/EarEjbProject/EjbServerModule/GreetingBean");
			String text=greeting.greet("hamid");
			System.out.println(text);



			System.out.println("exit");
			context.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


}