package chap03;

public class StarPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // 줄 수
            for (int j = 1; j <= i; j++) { // 해당 줄에 출력될 별의 개수
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}