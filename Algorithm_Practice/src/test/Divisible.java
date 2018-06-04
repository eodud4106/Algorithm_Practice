package test;
import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		int ret_length = 0;
		
		for(int i=0; i<array.length; i++){
			if(array[i] % divisor == 0) {
				ret_length++;
			}
		}
		
		int[] ret = new int[ret_length];
		int ret_count = 0;
		
		for(int i = 0; i<array.length; i++){
			if(array[i] % divisor == 0){
				ret[ret_count] = array[i];
				ret_count++;
			}
		}
		
		return ret;
	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}
