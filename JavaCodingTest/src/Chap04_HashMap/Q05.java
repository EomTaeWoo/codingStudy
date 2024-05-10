package Chap04_HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Q05 {
	
	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		// TreeSet은 중복제거를 위해서 사용
		// Collections.reverseOrder() : 내림차순으로 자동정렬 / 없으면 오름차순
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < n; i ++) {
			for(int j = i + 1; j < n; j ++) {
				for(int l = j + 1; l < n; l ++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt =0;
		//Tset.remove(143);
		//System.out.println(Tset.size());
		//System.out.println(Tset.first());	// 오름차순이면 최솟값, 내림차순이면 최대값
		System.out.println(Tset.last()); 	// first와 반대
		for(int x : Tset) {
			cnt ++;
			if(cnt == k) {
				return x;
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
