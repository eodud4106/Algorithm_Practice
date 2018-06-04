package test;

public class SumMatrix {
	int[][] sumMatrix(int[][] A, int[][] B) {
		
		int row = Math.max(A.length, B.length);
		int col = Math.max(A[0].length, B[0].length);
		int[][] answer = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++){
				answer[i][j] = A[i][j] + B[i][j];
				System.out.print(answer[i][j]);
			}
			System.out.println("");
		}
		
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2 }, { 2, 3 } };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다. 제출을 눌러 보세요");
		} else {
			System.out.println("틀렸습니다. 수정하는게 좋겠어요");
		}
	}
}
