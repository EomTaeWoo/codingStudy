package BasicMath01;

import java.util.Scanner;

public class Chap01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//�Һ� ���
		int b = sc.nextInt();	//���� ���
		int c = sc.nextInt();	//��ǰ ����
		
		if (c <= b) {
			System.out.println("-1");
		}else {
			System.out.println(a/(c-b)+1);
		}
		System.out.println("�׽�Ʈ");
	}

}
