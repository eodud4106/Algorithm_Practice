package test;

public class WaterMelon {
	public String watermelon(int n){
		
		String str_1 = "수";
		String str_2 = "박";
		StringBuffer sf = new StringBuffer();
		
		for(int i=1; i<=n; i++){
			if(i % 2 != 0){
				sf.append(str_1);
			} else {
				sf.append(str_2);
			}
		}
		return sf.toString();
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}
