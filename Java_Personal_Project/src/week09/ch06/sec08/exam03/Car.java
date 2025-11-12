package week09.ch06.sec08.exam03;

public class Car {
	int gas;
	
	// 리턴값이 없는 메소드로 매개값을 받아 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 리턴값이 boolean인 메소드로 gas필드값이 0이면 false, 0이 아니면 true 반환
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	// 리턴값이 없는 메소드로 gas필드값이 0이면 return 메소드 종료
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다 (gas잔량: "+ gas +")");
				gas -= 1;
			} else {
				System.out.println("멈춤니다 (gas잔량: " + gas +")");
				return;
			}
		}
	}
	
}