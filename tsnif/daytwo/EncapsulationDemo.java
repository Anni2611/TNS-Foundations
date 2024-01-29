package com.tsnif.daytwo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Encapsulator obj=new Encapsulator();
		obj.setName("hp");
		obj.setPrice(100.00f);
		obj.setSetno(1);
		System.out.println("this is the product"+obj);
	}

}
