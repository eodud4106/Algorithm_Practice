package test;

import java.util.Arrays;

public class Test1 {
	//살짝 수정되니?
	public static void main(String[] args) {
		
		String res = reverseStr("Zbcdefg");
		System.out.println(res);

	}
	
	public static String reverseStr(String str){
		
		String arr[] = str.split("");
		Arrays.sort(arr);
		StringBuffer sf = new StringBuffer();
		for(int i=0; i<arr.length; i++){
			sf.append(arr[i]);
		}
		return sf.reverse().toString();    

	}

}
