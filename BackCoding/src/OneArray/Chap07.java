package OneArray;

import java.util.Scanner;

public class Chap07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int testcase = sc.nextInt();
		
		for (int i = 0; i < testcase; i ++) {
			int N = sc.nextInt(); //�л� ��
			arr = new int[N];	//�� �л����� ������ �� �迭
			
			double sum = 0;		//���� �հ�
			
			for (int j = 0; j<N; j++) {
				int val = sc.nextInt();	//�����Է�
				arr[j] = val;			//�� ���� �ֱ�
				sum += val;				//���� �ջ�
			}
			double mean = (sum/N);		//��
			double count = 0;			//��ճѴ� �л� ��
			
			//����� �Ѵ� �л��� ã��
			for(int j = 0; j < N; j ++) {
				if(arr[j]> mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		sc.close();
	}

}
