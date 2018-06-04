package test;

public class Harshad_number {
	  public boolean solution(int x) {
	      boolean answer = true;
	      String num[] = String.valueOf(x).split("");
	      int isHarshad = 0;
	      
	      for(int i=0; i<num.length; i++){
	    	  isHarshad += Integer.parseInt(num[i]);
	      }
	      answer = (x % isHarshad == 0) ? true : false;
	      
	      return answer;
	  }
	  
	  public static void main(String[] args) {
		  Harshad_number hn = new Harshad_number();
		  System.out.println(hn.solution(10));
	  }
	  
}
