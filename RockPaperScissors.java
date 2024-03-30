package chap03;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		
		  
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("철수: ");
		        String firstPlayer = scanner.nextLine().trim().toLowerCase(); // 입력 받은 문자열을 소문자로 변환

		        System.out.print("영희: ");
		        String secondPlayer = scanner.nextLine().trim().toLowerCase(); // 입력 받은 문자열을 소문자로 변환

		        if (firstPlayer.equals(secondPlayer)) {
		            System.out.println("무승부!");
		        } else if (
		            (firstPlayer.equals("r") && secondPlayer.equals("s")) ||
		            (firstPlayer.equals("s") && secondPlayer.equals("p")) ||
		            (firstPlayer.equals("p") && secondPlayer.equals("r"))
		        ) {
		            System.out.println("철수, 승!");
		        } else {
		            System.out.println("영희, 승!");
		        }

		        scanner.close();
		    }
		}
	
	