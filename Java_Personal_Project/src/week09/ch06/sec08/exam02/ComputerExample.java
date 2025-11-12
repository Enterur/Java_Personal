package week09.ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2: " + result2);
		
		// sum 메소드 호출 시 배열을 제공하고
		// 합산 결과를 리턴받아 result3 변수에 대입
		int[] vaules = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(vaules);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4: " + result4);

	}

}