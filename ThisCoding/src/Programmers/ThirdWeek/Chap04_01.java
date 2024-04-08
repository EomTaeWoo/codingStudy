package Programmers.ThirdWeek;

public class Chap04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[][] triangle) {
		int answer = 0;
		
		// 위에서 아래로 계산하는 방식
		for(int i = 1; i < triangle.length; i ++) {
			for(int j = 0; j < triangle[i].length; j ++) {
				
				if(j == 0) {
					triangle[i][j] = triangle[i][j] + triangle[i - 1][j];
				} else if (i == j) {
					triangle[i][j] = triangle[i][j] + triangle[i - 1][j - 1];
				} else {
					int left = triangle[i][j] + triangle[i - 1][j - 1];
					int right = triangle[i][j] + triangle[i - 1][j];
					triangle[i][j] = Math.max(left, right);
				}
				
				
				answer = Math.max(answer, triangle[i][j]);
			}
		}
		
		// 밑에서 위로 계산하는 방식
		for(int i = triangle.length - 2; i >= 0; i--) {
			for(int j = 0; j < triangle[i].length; j ++) {
				int left = triangle[i][j] + triangle[i + 1][j];
				int right = triangle[i][j] + triangle[i + 1][j + 1];
				triangle[i][j] = Math.max(left, right);
			}
		}
		answer = triangle[0][0];
		
		return answer;
	}

}
