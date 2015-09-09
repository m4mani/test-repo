package com.datametica.manish_bajpai;

public class MainApp {
	public static void main(String[] args) {
		Test test = new Test();
		test.setValue1(5);
		test.setValue2(15);
		int sum = test.add(test.getValue1(), test.getValue2());
		System.out.println("sum of number "+sum);
		
	}
}
