package BasicMath01;

import java.util.Scanner;

public class Chap03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int cross_count = 1, prev_count_sum = 0;
		
		while(true) {
			// ���� �밢�� ���� �� + �ش� �밢�� ���� �̿��� ���� �Ǻ�
			if(x <= prev_count_sum + cross_count) {
				
				if(cross_count % 2 == 1) {	// �밢���� ������ Ȧ�����
					// ���ڰ� ū ������ ����
					// ���ڴ� �밢���� ���� �� ���� - (x��° - ���� �밢�������� �� ���� - 1)
					// �и�� x ��° - ���� �밢�������� �� ����
					System.out.println((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
					break;
				}
				else {
					// �밢������ ���� ������ ¦�����
					// Ȧ���϶� �ݴ��
					System.out.println((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
					break;
				}
			}
			else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}
