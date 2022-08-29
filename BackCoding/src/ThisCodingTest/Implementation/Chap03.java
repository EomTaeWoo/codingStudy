package ThisCodingTest.Implementation;

import java.util.Scanner;

public class Chap03 {

	public static void main(String[] args) {
		// 왕실의 나이트 문제
		/*
		행복 왕국의 왕실 정원은 체스판과 같은 8 * 8 평면입니다. 왕실 정원의 특정한 한 칸에 나이트가 서있습니다.
		나이트는 매우 충성스러운 신하로서 매일 무술을 연마합니다.
		나이트는 말을 타고 있기 때문에 이동할 때는 L자 형태로만 이동할 수 있으며 정원 밖으로는 나갈 수 없습니다.
		나이트는 특정 위치에서 다음과 같은 2가지 경우로 이동할 수 있습니다.
		1. 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
		2. 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
		*/
		Scanner sc = new Scanner(System.in);
		
		//현재 나이트의 위치 입력받기
		String inputData = sc.nextLine();
		int row = inputData.charAt(1) - '0';
		int column = inputData.charAt(0) - 'a' + 1;
		
		//나이트가 이동할 수 있는 8가지 방향 정의
		int[] dx = {-2,-1,1,2,2,1,-1,-2};
		int[] dy = {-1,-2,-2,-1,1,2,2,1};
		
		//8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
		int result = 0;
		for(int i = 0; i < 8; i ++) {
			//이동하고자 하는 위치 확인
			int nextRow = row + dx[i];
			int nextColumn = column + dy[i];
			//해당 위치로 이동이 가능하다면 카운트 증가
			if(nextRow >= 1 && nextRow <= 8 && nextColumn >=1 && nextColumn <= 8) {
				result += 1;
			}
		}
		System.out.println(result);
	}

}
