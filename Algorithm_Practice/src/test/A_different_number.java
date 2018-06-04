package test;
import java.util.ArrayList;
import java.util.Arrays;

public class A_different_number {
	
	public int[] solution(int[] arr) {		
        ArrayList<Integer> temp_list = new ArrayList<>();
        temp_list.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
        	boolean isOverlap = false;
        	for(int j=0; j<temp_list.size(); j++){
        		if(arr[i]==temp_list.get(j)){
        			isOverlap = true;
        			break;
        		}
        	}
        	if(isOverlap==false){
        		temp_list.add(arr[i]);
        	}
        }
        int[] answer = new int[temp_list.size()];
        for(int i=0; i<temp_list.size(); i++){
        	answer[i] = temp_list.get(i);
        }
        Arrays.sort(answer);

        return answer;
	}

	public static void main(String[] args) {		
		A_different_number da = new A_different_number();
		int arr[] = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(da.solution(arr)));
		
	}

}
