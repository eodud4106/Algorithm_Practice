package test;

import java.util.Scanner;

public class Collatz {

    public int solution(int num) {
        int answer = 0;
        long n = num;
        while(n != 1){
        	if(answer > 499){
        		answer = -1;
        		break;
        	} else {
        		if(n % 2 == 0){
        			n = n / 2;
        		} else{
        			n = (n * 3) + 1;
        		}	
        	}
        	answer++;
        	System.out.println(answer);
        	System.out.println("n : " + n);
        }
        
        return answer;
    }

	public static void main(String[] args) {		
		Collatz da = new Collatz();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요  : ");
		int num = sc.nextInt();
		System.out.println("반복횟수 : " + da.solution(num));
		
	}

}
