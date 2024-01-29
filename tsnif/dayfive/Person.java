package com.tsnif.dayfive;

public class Person {
  private String Name;
  private Address address;
  
  
  
public Person(String name, Address address) {
	super();
	Name = name;
	this.address = address;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [Name=" + Name + ", address=" + address + "]";
}
  
  
}
