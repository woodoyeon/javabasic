package chap03;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int number = scanner.nextInt();
		
		do {
			System.out.println( " 양의 정수를 입력하세요 (0 이하의 수 입력시 종료): ");
			number = scanner.nextInt();
		
		
		if ( number > 0 && number % 2 == 0 ) {
			sum += number;
		} 
		}while (number > 0);
		System.out.println(" 입력된 양의 정수 중 짝수의 합:" + sum);
		scanner.close();
		

}

}