package week07.ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// 각 반의 학생 수가 같을 경우, 2 by 3로 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println(" mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
			}
		}
		System.out.println();
		
		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i = 0; i < mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for (int k = 0; k < mathScores[i].length; k++) {
				totalMathSum += mathScores[i][k];
			}
		}
		
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();
		
		// 각 반의 학생 수가 다른 경우, 2차원 배열 생성
		int[][] englishScores = new int [2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScore[" + i + "][" + k + "]: " + englishScores[i][k]);
			}
		}
		System.out.println();
		
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
				
		totalStudent = 0;
		int totalEnglishSum = 0;
		for (int i = 0; i < englishScores.length; i++) {
			totalStudent += englishScores[i].length;
			for (int k = 0; k < englishScores[i].length; k++) {
				totalEnglishSum += englishScores[i][k];
			}
		}
				
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
	}
}