package chap03;

import java.util.Scanner;

public class Adult_Minor {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("나이를 입력하세요: ");
	int age = scanner.nextInt();
	
	if ( age >= 19 ) {
		System.out.println("성년");
	} else {
		System.out.println("미성년");
	}
	
	scanner.close();
	}

}
