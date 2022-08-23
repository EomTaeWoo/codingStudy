package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chap01_01 {

	public static void main(String[] args) throws IOException{
		//BufferedReader ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�ݺ��� ���� ����
		int n = Integer.parseInt(br.readLine());
		
		//StringTokenizer�� �Է�
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//�迭 ���� ����
		int[] array = new int[n];
		
		//n��ŭ �ݺ�
		for (int i = 0; i< n; i++) {
			//�迭�� ������ �Է�
			array[i] = Integer.parseInt(st.nextToken());
		}
		//min, max ���� ���� �� �ʱⰪ ����
		int min = array[0];
		int max = array[0];
		
		//n��ŭ �ݺ�
		for (int i = 0; i< n; i++) {
			//min, max�� ���ؼ� ���Ѵ�
			if(min> array[i]) {
				min = array[i];
			}else if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.printf("%d %d",min,max);
	}

}
