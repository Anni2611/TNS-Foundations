package com.tsnif.dayfive;
//contained class : bcoz its object is passs to another class (has to implementation)
public class Address {
   private String City;
   private String State;
   private String Country;
   
   public Address() {
	   super();
   }
  
public Address(String city, String state, String country) {
	super();
	City = city;
	State = state;
	Country = country;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
@Override
public String toString() {
	return "Address [City=" + City + ", State=" + State + ", Country=" + Country + "]";
}
   
}
