package Chap02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Qtest {

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		
		return answer;
	}

	public static void main(String[] args) {
		Q01 T = new Q01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
		
	}

}
