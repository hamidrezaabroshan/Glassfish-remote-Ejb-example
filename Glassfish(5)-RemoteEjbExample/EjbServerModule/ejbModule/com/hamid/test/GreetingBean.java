package com.hamid.test;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
@Remote
@Stateless
public class GreetingBean implements Greeting  {
	@Override
	public String greet(String name) {
		String greet ="hello"+name;
		System.out.println(greet);
		return greet;
	}

}
