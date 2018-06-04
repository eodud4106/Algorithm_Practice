package test;

	public class Maru_Test {
		
		Maru_Test() { System.out.println("c");}
		
		{System.out.println("y");}

		public static void main(String[] args) {
			new Maru_Test().go();
		}
		
		void go() {System.out.println("g");}
		static {System.out.println("x");}
		
		//x, y, c, g

}
