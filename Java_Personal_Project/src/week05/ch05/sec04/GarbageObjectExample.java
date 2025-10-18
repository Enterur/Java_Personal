package week05.ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // hobby에 null 대입해 쓰레기 값으로 만듬
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null; // kind2가 참조하고 있어 String객체가 쓰레기 값이 안 됨
		System.out.println("kind1: " + kind2);
	}
}