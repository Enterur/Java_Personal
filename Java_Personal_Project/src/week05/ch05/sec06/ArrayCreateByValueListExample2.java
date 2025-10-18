package week05.ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87}; // 선언 시 배열 대입 하지 않으므로 "new"타입으로 재선언
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		// printItem 메소드 호출
		printItem( new int[] {83, 90, 87} );
	}
	// printItem  메소드 선언
	public static void printItem( int[] scores) {
		for (int i = 0; i < 3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}
}