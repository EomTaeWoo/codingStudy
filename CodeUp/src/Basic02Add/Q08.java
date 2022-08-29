package Basic02Add;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		
		StringTokenizer stn = new StringTokenizer(time, ".");
		
		String[] srt = new String[3];
		for(int i = 0; i < 3; i ++) {
			srt[i] = stn.nextToken();
		}
		
		int y = Integer.parseInt(srt[0]);
		int h = Integer.parseInt(srt[1]);
		int m = Integer.parseInt(srt[2]);
		
		System.out.printf("%04d.%02d.%02d",y,h,m);
	}
}
