package test;


public class Test {

	public static void main(String[] args) {
		System.out.println(solution(11));
		System.out.println(new String('a'));
	}
	
	public static String solution(int N) {
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < N-1; i++) {
			builder.append("a");
		}
		
		if(N % 2 == 0) {
			builder.append("b");
		}else {
			builder.append("a");
		}
		
		return builder.toString();
	}
	
}
