package ThisCodingTest.Grid;

import java.util.Scanner;

public class Chap02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n, k�� ������ �������� �����Ͽ� �Է¹ޱ�
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while(true) {
			// N�� K�� ������ �������� ���� �� ������ ����
			int target = (n/k) * k;
			result += (n - target);
			n = target;
			//n�� k���� ���� �� (���̻� ���� �� ���� ��) �ݸ� Ż��
			if(n < k) break;
			//k�� ������
			result += 1;
			n /= k;
		}
		
		//���������� ���� ���� ���Ͽ� 1�� ����
		result += (n - 1);
		System.out.println(result);
	}

}
