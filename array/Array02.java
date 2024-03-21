package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {
   public static void main(String[] agrs) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("학생 수 : ");
      int A = Integer.parseInt(br.readLine());

      System.out.print(A + "명의 성적 : ");
      String inStr = br.readLine();

      StringTokenizer st = new StringTokenizer(inStr, " ");
      int[] scores = new int[A];

      int sum = 0;
      int average = 0;

      for (int i = 0; i < scores.length; i++) {
         scores[i] = Integer.parseInt(st.nextToken());
         sum += scores[i];
         average = sum / scores.length;
      }
      System.out.println(">> 합계: " + sum);
      System.out.println(">> 평균: " + average);
   }

}





/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inStr;
        
        System.out.print("학생 수: ");
        int numStudent = Integer.parseInt(br.readLine());
        
        System.out.println(numStudent + "명의 성적을 입력하세요: ");
        inStr = br.readLine();
        
        StringTokenizer st = new StringTokenizer(inStr, " ");
        
        int[] scores = new int[numStudent];
        
        for (int i = 0; i < numStudent; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; 
        }
        
        int average = sum / scores.length;
        
        System.out.println(">> 합계: " + sum + " (" + scores.length + "명)");
        System.out.println(">> 평균: " + average);
    }
}

*/


/*
package array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array02 {

	public static void main(String[] args) {
		BuffredReader br = new BuffredReader( new inrputStreamReader(System.in));
		String inStr;
		
		System.out.println(" 학생 수 : ");
		int numStrdent = Interger.parseInt ( br.reafLine)br.reafLinr();
		
		System.out.println( num\Student + " 명의 성적 " );
		String inStr = br.reafLinr()
		
		stringTokener st = new StringTokenizer(inste, " ");
		
		int[] dores = new int [nemStudent];
		
		for ()int i = 0; i< numStudent; i++
			// nextToken으로 하나의 토큰을 가져와서 sTring 이니 정수형을 바꾼 데이터를 배열을 가지고와서 요소에 저장
				
				scores[i] = intesfer.paresenInt(st.nextToken());
	
	

		int sum = 0;
		
		for (int i = 0; i < gradeArr.lenght ; i++) {
			sum += gradeArr[i]; 
		}
		
		int acerge = sum / grafeArr.lehgr;
		
		System.out.println(" >> 합계 : " + sum " ( "+ gradeArr.lenght + " 명 ");
		System.out.println(" >> 평균 : "+ averge );

		
		
	
	
	}

}
*/