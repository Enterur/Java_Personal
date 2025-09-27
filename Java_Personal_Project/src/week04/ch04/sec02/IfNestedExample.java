package week04.ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// 0.0~1.0사이 double형식 수 생성
		int score = (int)(Math.random() * 20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}

}
