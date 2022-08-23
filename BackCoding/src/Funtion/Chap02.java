package Funtion;

public class Chap02 {
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];	//1���� 10001�̹Ƿ�
		
		for (int i = 0; i< 10001; i ++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i<10001;i++) {
			if (!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum += (number % 10);		//ù �� �ڸ���
			number /= 10;				//10�� ������ ù ° �ڸ��� ���ش�
		}
		return sum;
	}
}
