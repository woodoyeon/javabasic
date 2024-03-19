package scanner;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {

	double PI  = 3.14;
		
	Scanner input = new Scanner(System.in);
	System.out.print( " 원의 반지름을 입력하세요. (cm) : ");
	int num = input.nextInt();
	
	System.out.println( "원의넓이는" + (PI*num*num) + "cm 입니다" );
	
	
	
			
			
	
	
}
}