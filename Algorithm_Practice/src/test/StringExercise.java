package test;

class StringExercise{
    String getMiddle(String word){	
		if(word.length() % 2 != 0){
			return String.valueOf(word.charAt(word.length() / 2));
		}
		else {
			return String.valueOf(word.charAt(word.length() / 2 - 1)) + String.valueOf(word.charAt(word.length() / 2));
		}    
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
