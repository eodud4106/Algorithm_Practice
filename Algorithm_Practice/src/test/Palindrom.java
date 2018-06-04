package test;

public class Palindrom {

    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("");
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<str.length; i++){
        	sb.append(str[i]);
        }
        
        if(s.equals(sb.reverse().toString())){
        	answer = s.length();
        } else{
        	int x = solution(s.substring(0, s.length()-1));
        	int y = solution(s.substring(1, s.length()));
        	answer = Math.max(x, y);
        	System.out.println("x : " + x);
        	System.out.println("y : " + y);
        	System.out.println("s : " + s);
        	System.out.println("answer : " + answer);
        }

        return answer;
    }

	public static void main(String[] args) {		
		Palindrom da = new Palindrom();
		System.out.println(da.solution("abac"));
		//System.out.println(da.solution("caba"));
	}

}
