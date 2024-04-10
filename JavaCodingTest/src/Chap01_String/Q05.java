package Chap01_String;

import java.util.Scanner;

/**
 * 
 * Ư�� ���� ������
 * 
 * ���� : ���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
 * Ư�����ڴ� �ڱ� �ڸ��� �״�� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * �Է� : ù �⿡ ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
 * 
 * ��� : �� �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
 * 
 * �Է¿��� : a#b!GE*T@S
 * ��¿��� : S#T!EG*b@a
 *
 */
public class Q05 {

	public String solution(String str) {
		String answer = "";
		
		char[] s = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt ++;
			} else if (!Character.isAlphabetic(s[rt])) {
				rt --;
			} else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt ++;
				rt --;
			}
			
		}
		answer = String.valueOf(s);
		
		return answer;
	}
	
	public static void main(String[] args) {

		Q05 T = new Q05();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}

}
