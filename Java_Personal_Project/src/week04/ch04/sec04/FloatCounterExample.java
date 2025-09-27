package week04.ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		// float 부동소수점 계산으로 잚못된 출력
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}

}