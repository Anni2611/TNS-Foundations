package com.tsnif.daytwo;

public class Encapsulator {
   private int setno;
   private String name;
   private float price;
public int getSetno() {
	return setno;
}
public void setSetno(int setno) {
	this.setno = setno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Encapsulator [setno=" + setno + ", name=" + name + ", price=" + price + ", getSetno()=" + getSetno()
			+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}
   

}
