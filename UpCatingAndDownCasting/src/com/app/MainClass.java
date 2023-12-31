package com.app;

public class MainClass {

	public static void main(String[] args) {
		Animal animal = new Cat();// upCasting
		animal.animalSound();
//		animal.specialMethod();// we cannot access cat's special method from upCasting
		Cat cat = (Cat) animal;// DownCasting
		cat.specialMethod();

	}

}
//Whatever the parent has by default available to the child but whatever the child
//has by default not available to the parent. Hence on the child reference we can
//call both parent and child class methods. But on the parent reference we can call
//only methods available in the parent class and we can't call child specific
//methods.


//Parent class reference can be used to hold child class object but by using that
//reference we can call only methods available in parent class and child specific
//methods we can't call.

//Child class reference cannot be used to hold parent class object.