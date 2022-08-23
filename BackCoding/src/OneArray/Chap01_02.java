package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배열을 사용하지 않고
public class Chap01_02 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int b = Integer.parseInt(st.nextToken());
		
		int min = b;
		int max = b;
		
		for (int i = 0; i< n-1; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(min>a) {
				min = a;
			}else if (max<a) {
				max = a;
			}
		}
		System.out.println(min+" "+max);
	}
}
