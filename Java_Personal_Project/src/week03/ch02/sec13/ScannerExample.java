package week03.ch02.sec13;

// Scanner 클래스 불러옴
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		// scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		/* 읽은 문자열 String 변수에 저장
		'enter'키 누르면 입력된 문자열 읽음 */
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while (true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if (data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}

}