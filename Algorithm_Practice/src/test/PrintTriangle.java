package test;

public class PrintTriangle {
	public String printTriangle(int num){
		String res = "";
		
		for(int i=1; i<=num; i++){
			
			for(int j=1; j<=i; j++){
				res = res + "*";
			}
			res = res + "\n";
		}

		return res;		
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(5) );
	}
}
