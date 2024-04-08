package Programmers.OneWeek;

// 마법의 엘레베이터
public class Step02_02 {

	public static void main(String[] args) {
		int result = solution(16);
		
		System.out.println(result);
	}
	
	public static int solution(int storey) {
		return elevator(storey);
	}
	
	private static int elevator(int floor) {
		if(floor <= 1) return floor;
		
		int under10 = floor % 10;
		int rest = floor / 10;
		
		int c1 = under10 + elevator(rest);
		int c2 = (10 - under10) + elevator(rest + 1);
		
		return Math.min(c1, c2);
	}

}

