package com.inharitance;

public class DisplayCar {

	public static void main(String[] args) {
		
		
		BmwCar bc= new BmwCar();
		bc.black();
		bc.frontWheel();
		bc.model();
		System.out.println("------------toyota care----------------");
	ToyotaCar tc= new ToyotaCar();
	tc.white();
	tc.allWhile();
	tc.model();
    tc.frontWheel();
	}

}
