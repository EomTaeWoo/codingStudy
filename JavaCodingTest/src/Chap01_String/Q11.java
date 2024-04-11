package Chap01_String;

import java.util.Scanner;

/**
 * 
 * ���ڿ� ����
 * 
 * ���� : ���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ� ���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
 * 
 * �Է¼��� : ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * 
 * ��¼��� : ù �ٿ� ����� ���ڿ��� ����Ѵ�.
 * 
 * �Է¿��� : KKHSSSSSSSE
 * ��¿��� : K2HS7E
 *
 */

public class Q11 {

	public String solution(String str) {
		String answer = "";
		
		str = str + " ";
		int cnt = 1;
		for(int i = 0; i < str.length()-1; i ++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt ++;
			} else {
				answer += str.charAt(i);
				if(cnt > 1) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q11 T = new Q11();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}

}
