package main.quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int i = num / 10;
		
		int x = num % 10;
		
		int sum = i + x;
		
		System.out.println(sum);
		
	}

}
