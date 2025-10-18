package week07.ch05.sec08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		// newIntArray에 oldIntArray 항목 복사
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
		
	}
}