package Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Chap12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] origin = new int[n];
		int[] sorted = new int[n];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			sorted[i] = origin[i] = sc.nextInt();
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v,rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}

}
