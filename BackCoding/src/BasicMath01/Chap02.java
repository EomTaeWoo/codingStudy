package BasicMath01;

import java.util.Scanner;

public class Chap02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1;	//���� �� (�ּ� ��Ʈ)
		int range = 2;	//���� (�ּҰ� ����)
		
		if(N == 1) {
			System.out.println(1);
		}
		else {
			while (range <= N) {				//������ N���� Ŀ���� �������� �ݺ�
				range = range + (6 * count);	// ���� ������ �ּڰ����� �ʱ�ȭ
				count ++;
			}
			System.out.println(count);
		}
		
	}
}
