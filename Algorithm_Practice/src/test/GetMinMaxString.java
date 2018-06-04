package test;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	String[] num = str.split(" ");
    	int max = Integer.parseInt(num[0]);
    	int min = Integer.parseInt(num[0]);
    	
    	for(int i=0; i<num.length; i++){
    		if(max < Integer.parseInt(num[i])){
    			max = Integer.parseInt(num[i]);
    		}
    		if(min > Integer.parseInt(num[i])){
    			min = Integer.parseInt(num[i]);
    		}
    	}
    		
        return min + " " + max;
    }

    public static void main(String[] args) {
        String str = "0 -2 -3 1";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
