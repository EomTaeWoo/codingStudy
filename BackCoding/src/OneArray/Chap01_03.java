package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chap01_03 {

	public static void main(String[] args) throws IOException {
		// BufferedReader ���� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// �ݺ��� ���� ���� 
		int n = Integer.parseInt(br.readLine()); 
		// StringTokenizer�� �Է� 
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		// �迭 ���� ���� 
		int[] array = new int[n]; 
		// N��ŭ �ݺ� 
		for(int i = 0; i < n; i++) { 
			// ������ �Է�
			array[i] = Integer.parseInt(st.nextToken());
		} 
		// �迭.sort ��� 
		Arrays.sort(array);
		// ���
		// ��� 
		System.out.print(array[0] + " " + array[n - 1]);

	}

}
