package test;

public class JadenCase {

    public String solution(String s) {
    	String answer = "";
    	String[] str_ary = s.split("");
    	boolean flag = true;
    	
    	for(int i=0; i<str_ary.length; i++){
    		if(str_ary[i].equals(" ")){
    			flag = true;
    			answer += str_ary[i];
    			continue;
    		}
    		if(flag == true){
    			answer += str_ary[i].toUpperCase();
    			flag = false;
    		} else{
    			answer += str_ary[i].toLowerCase();
    		}
    	}
    	//깃됬니?
    	return answer;
    }

	public static void main(String[] args) {		
		JadenCase jc = new JadenCase();
		String str = "asldjkDasdasdasdDDD show me the money";
		System.out.println(jc.solution(str));
	}

}
