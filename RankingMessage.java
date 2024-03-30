package chap03;

import java.util.Scanner;

public class RankingMessage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 등수를 입력하세요 : ");
		int rank = scanner.nextInt();
		
		switch (rank ) {
		case 1:
			System.out.println( " 아주 잘 했습니다! ");
			break;
			
		case 2:
		case 3:
			System.out.println( " 잘 했습니다! ");
			break;
			
		case 4:
		case 5:
		case 6:
			System.out.println( " 보통입니다. ");
			break;
			
		default:
			
			
			
			
			
		}
		
		
		

	}

}
