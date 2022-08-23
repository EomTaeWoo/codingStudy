package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Chap04_01 {

	public static void main(String[] args) throws IOException{
		// 시간은 단축시키시 위해 입력방법을 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i< 10; i ++) {
			h.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(h.size());
	}

}
