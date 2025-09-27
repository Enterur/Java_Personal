package week04.ch04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		// int score = 87;
		// int score = 64;
		// int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90~100 입니다");
			System.out.println("A등급 입니다");
		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다");
			System.out.println("B등급 입니다");
		} else if (score >= 70) {
			System.out.println("점수가 70~79 입니다");
			System.out.println("C등급 입니다");
		} else {
			System.out.println("점수가 70미만 입니다");
			System.out.println("D등급 입니다");
		}
	}

}
