package jump;

public class Continue01 {

	public static void main(String[] args) {
		
		
		
		
		for (int i = 2; i <= 9; i++) {
		    if (i == 4 || i == 7) {
		        continue; // 4단과 7단은 출력하지 않고 건너뜁니다.
		    }
		    
		    System.out.println(i + "단");
		    for (int j = 1; j <= 9; j++) {
		        System.out.println(i + " * " + j + " = " + (i * j));
		    }
		    System.out.println();
		}

		
		
		
		
		
		
		
		
		

	}

}
