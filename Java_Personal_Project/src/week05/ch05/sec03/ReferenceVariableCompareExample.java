package week05.ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// 배열 변수 arr1~3 선언
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		// 배열 생성 후 arr 변수에 대입
		arr1 = new int[] { 1, 2, 3 }; // arr1, arr2 번지 수 다름
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2; // 번지 수 동일
		
		System.out.println(arr1 == arr2); // == <- 참조형에서 번지 수(메모리 주소) 비교
		System.out.println(arr2 == arr3);
	}
}