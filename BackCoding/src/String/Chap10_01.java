package String;

import java.util.Scanner;

public class Chap10_01 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int count = 0;
		int N = in.nextInt();
		
		for (int i = 0; i < N; i ++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() {
		boolean[] check = new boolean[20];
		int prev = 0;
		String str = in.next();
		
		for (int i = 0; i< str.length(); i++) {
			int now = str.charAt(i);	//i번째 현 문자 저장
			
			if (prev != now) {	//now현재 문자와 i번째 문자가 같다면
				if(check[now - 'a'] == false) { 	//해당 문자가 처음 나오는 경우(false인경우)
					check[now - 'a'] = true; 	//true로 바꿔준다
					prev = now;					//다음 턴을 위해 prev도 바꿔준다
				} else {	//해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아닌 경우)
					return false;
				}
			} else {		//앞선 문자와 i번째 문자가 같다면(연속된 문자)
				continue;
			}
		}
		return true;
	}

}
