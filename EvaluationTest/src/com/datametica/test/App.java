package com.datametica.test;
import java.util.Scanner; 
public class App {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number till you want a star pattern");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		label: for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j > i) {
					System.out.println();
					continue label;
				} else {
					System.out.print("*");
				}
			}
		}
	}
}