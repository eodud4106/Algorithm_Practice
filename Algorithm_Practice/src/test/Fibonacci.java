package test;

class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		long start_x_val = 0;
		long start_y_val = 1;
		
		for(int i=1; i<num; i++){
			answer = start_x_val + start_y_val;
			start_x_val = start_y_val;
			start_y_val = answer;
		}
		
		return answer;
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
