package chap03;

public class RightTriangle {

	public static void main(String[] args) {
	
		  for (int a = 1; a <= 20; a++) { // 첫 번째 변
	            for (int b = a; b <= 20; b++) { // 두 번째 변 (a 이상)
	                for (int c = b; c <= 20; c++) { // 세 번째 변 (b 이상)
	                    if (a + b + c <= 20 && a * a + b * b == c * c) { // 각 변의 합이 20 이하이며 피타고라스의 정리 확인
	                        System.out.println("직각 삼각형 변: " + a + ", " + b + ", " + c);
	                    }
	                }
	            }
	        }
	    }
	}