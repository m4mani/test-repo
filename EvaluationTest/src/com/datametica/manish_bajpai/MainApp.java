package com.datametica.manish_bajpai;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Test test = new Test();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter String");
		String val2=sc.nextLine();
		test.setValue2(val2);
		String sum = test.add(test.getValue2());
		System.out.println("String is "+sum);
		
	}
}
