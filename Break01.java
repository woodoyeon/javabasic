package jump;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int num;

		while (true) {
		    System.out.print("양의 숫자를 입력하세요: ");
		    num = input.nextInt();
		    
		    if (num <= 0) {
		        System.out.println("입력한 숫자가 0 또는 음수입니다. 프로그램을 종료합니다.");
		        break;
		    }
		    
		    int sum = 0;
		    for (int i = 1; i <= num; i++) {
		        sum += i;
		    }
		    System.out.println("1부터 " + num + "까지의 합 : " + sum);
		}
		

	}

}
