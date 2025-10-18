package week07.ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for (int score : scores) { // scores 배열 score변수에 한 번씩 저장, 총 반복 5회
			sum += score;
		}
		System.out.println("점수 총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균: " + avg);
		
	}
}