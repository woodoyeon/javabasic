package chap03;

import java.util.Scanner;

public class RockPaperScissors_method {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        String c = input("철수", scanner);
	        String y = input("영희", scanner);
	        whosWin(c, y);

	        scanner.close();
	    }

	    // 사용자로부터 입력을 받는 메서드
	    public static String input(String playerName, Scanner scanner) {
	        System.out.print(playerName + ": ");
	        return scanner.nextLine().trim().toLowerCase();
	    }

	    // 승자를 결정하고 출력하는 메서드
	    public static void whosWin(String c, String y) {
	        if (c.equals(y)) {
	            System.out.println("무승부!");
	        } else if (
	            (c.equals("r") && y.equals("s")) ||
	            (c.equals("s") && y.equals("p")) ||
	            (c.equals("p") && y.equals("r"))
	        ) {
	            System.out.println("철수, 승!");
	        } else {
	            System.out.println("영희, 승!");
	        }
	    }
	}
