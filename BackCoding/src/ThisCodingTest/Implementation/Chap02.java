package ThisCodingTest.Implementation;

import java.util.Scanner;

public class Chap02 {
	public static boolean check(int h, int m, int s) {
		if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 ==3 || s % 10 == 3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//�ð� ����
		/*
		���� N�� �ԷµǸ� 00�� 00�� 00�ʷκ��� N�� 59�� 59�ʱ����� ��� �ð� �߿��� 3�� �ϳ��� ���ԵǴ�
		��� ����� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. ���� � 1�� �Է����� �� ������ 3�� �ϳ��� ���ԵǾ�
		�����Ƿ� ����� �ϴ� �ð� �Դϴ�.
		- 00�� 00�� 03��
		- 00�� 13�� 00��
		�ݸ鿡 ������ 3�� �ϳ��� ���ԵǾ� ���� �����Ƿ� ���� �� �Ǵ� �ð��Դϴ�.
		- 00�� 02�� 55��
		- 01�� 27�� 45��
		*/
		Scanner sc = new Scanner(System.in);
		
		// H�� �Է¹ޱ�
		int h = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i <= h; i++) {
			for(int j = 0; j < 60; j ++) {
				for(int k = 0; k < 60; k++) {
					//�� �ð� �ȿ� '3' �� ���ԵǾ� �ִٸ� ī��Ʈ ����
					if(check(i,j,k)) cnt ++;
				}
			}
		}
		System.out.println(cnt);
	}
}
