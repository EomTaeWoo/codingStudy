package String;

import java.util.Scanner;

public class Chap10_01 {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int count = 0;
		int N = in.nextInt();
		
		for (int i = 0; i < N; i ++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() {
		boolean[] check = new boolean[20];
		int prev = 0;
		String str = in.next();
		
		for (int i = 0; i< str.length(); i++) {
			int now = str.charAt(i);	//i��° �� ���� ����
			
			if (prev != now) {	//now���� ���ڿ� i��° ���ڰ� ���ٸ�
				if(check[now - 'a'] == false) { 	//�ش� ���ڰ� ó�� ������ ���(false�ΰ��)
					check[now - 'a'] = true; 	//true�� �ٲ��ش�
					prev = now;					//���� ���� ���� prev�� �ٲ��ش�
				} else {	//�ش� ���ڰ� �̹� ���� ���� �ִ� ��� (�׷�ܾ �ƴ� ���)
					return false;
				}
			} else {		//�ռ� ���ڿ� i��° ���ڰ� ���ٸ�(���ӵ� ����)
				continue;
			}
		}
		return true;
	}

}
