package week04.ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		//int score = 79;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("A등급 입니다");
		}
		
		if (score < 90) {
			System.out.println("점수가 90보다 작슴니다");
			System.out.println("B등급 입니다");
		}
	}

}
