package Chap01_String;

import java.util.Scanner;

/**
 * 
 * ���ڰŸ�
 * 
 * ���� : �� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * �Է� ���� : ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
 * ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * 
 * �ⷰ ���� : ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� t�� ������ �Ÿ��� ������� ö���Ѵ�.
 * 
 * �Է¿��� : teachermode e
 * ��¿��� : 1 0 1 2 1 0 1 2 2 1 0
 *
 */
public class Q10 {

	public int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		int p = 1000;
		for(int i = 0; i < str.length(); i ++) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			} else {
				p ++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		for(int i = str.length()-1; i >= 0; i --) {
			if(str.charAt(i) == c) {
				p = 0;
			} else {
				p ++;
				//answer[i] = Math.min(answer[i], p);
				if(answer[i] > p) {
					answer[i] = p;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q10 T = new Q10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char c = sc.next().charAt(0);
		
		for(int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}
	}

}
