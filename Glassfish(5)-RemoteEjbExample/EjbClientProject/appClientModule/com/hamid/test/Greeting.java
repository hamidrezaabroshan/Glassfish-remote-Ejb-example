package com.hamid.test;


import javax.ejb.Remote;

@Remote
public interface Greeting {
public String greet(String name);
}
