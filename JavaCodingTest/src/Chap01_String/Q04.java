package Chap01_String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * �ܾ� ������
 * 
 * ���� : N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * �Է� : ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
 * �� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * 
 * ��� : N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
 * 
 * �Է¿��� : 
 * 3
 * good
 * Time
 * Big
 * 
 * ��¿��� : 
 * doog
 * emiT
 * giB
 *
 */
public class Q04 {
	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
		/*
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		*/
		
		// ���ڿ��� ���ڹ迭�� �����ؼ� ��ġ�� ����
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length() - 1;
			
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt ++;
				rt --;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i <n; i ++) {
			str[i] = sc.next();
		}
		
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}

}
