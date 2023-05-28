package com.wiley.springcore1.ci;

public class Person {
private String name;
private int id;
private Cert cert;
public Person(String name, int id, Cert cert) {
	super();
	this.name = name;
	this.id = id;
	this.cert = cert;
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + "]";
}

}
