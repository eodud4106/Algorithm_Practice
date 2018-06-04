package test;
import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int lcm = a * b;
        int gcd;
        
        while(b!=0){
        	gcd = a % b;
        	a = b;
        	b = gcd;
        }
        
        lcm = lcm / a;
        answer[0] = a; answer[1] = lcm;

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(2, 5)));
    }
}
