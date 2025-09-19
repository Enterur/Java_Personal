package week03.ch02.sec11;

public class VariableScopeExample {
	
	static int v2;

	public static void main(String[] args) {
		int v1 = 15;
		
		if (v1 > 10) {
			int v2 = v1 - 10; // v2 local_variation 사용 불가 -> 컴파일 에러
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}

}
