package Chap01;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04 {
	
	public ArrayList<String> solution(String[] strList){
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : strList) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] strList = new String[num];
		for(int i = 0; i < num; i ++) {
			strList[i] = sc.next();
		}
		for(String x : T.solution(strList)) {
			System.out.println(x);
		}
		
	}

}
