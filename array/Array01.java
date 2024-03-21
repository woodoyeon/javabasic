package array;

public class Array01 {

	public static void main(String[] args) {
		 
		// 배열에 들어있는 값의 합과 평균 구하기
		int []grandArr = { 90, 70, 80, 79, 82, 50, 70, 90, 89, 89};
		
		
		// 합계 구하기
        int sum = 0;
        for (int num : grandArr) {
            sum += num;
        }
        
        // 평균 구하기
        int average = sum / grandArr.length;
        
        // 결과 출력
        System.out.println("배열에 들어있는 값의 합: " + sum);
        System.out.println("배열에 들어있는 값의 평균: " + average);
		
		
	}

}


















/*
package array;

public class Array01 {

	public static void main(String[] args) {
		int [] gradeArr = { 90, 70, 80, 79, 82, 50, 70, 90, 89, 89};
		
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