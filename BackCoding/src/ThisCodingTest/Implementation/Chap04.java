package ThisCodingTest.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chap04 {

	public static String str;
	public static ArrayList<Character> result = new ArrayList<Character>();
	public static int value = 0;
	
	public static void main(String[] args) {
		// ���ڿ� ������
		/*
		���ĺ� �빮�ڿ� ����(0~9)�θ� ������ ���ڿ��� �Է����� �־����ϴ�. �̶� ��� ���ĺ��� ������������
		�����Ͽ� �̾ ����� �ڿ�, �� �ڿ� ��� ���ڸ� ���� ���� �̾ ����մϴ�.
		���� ��� K1KA5CB7�̶�� ���� ������ ABCKK13�� ����մϴ�
		*/
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		//���ڸ� �ϳ��� Ȯ���ϸ�
		for(int i = 0; i< str.length(); i ++) {
			//���ĺ��� ��� ��� ����Ʈ�� ����
			if(Character.isLetter(str.charAt(i))) {
				result.add(str.charAt(i));
			} else {
				value += str.charAt(i) - '0';
			}
		}
		
		//���ĺ��� ������������ ����
		Collections.sort(result);
		
		//���ĺ��� ���ʴ�� ���
		for(int i = 0; i < result.size(); i ++) {
			System.out.print(result.get(i));
		}
		// ���ڰ� �ϳ��� �����ϴ� ��� ���� �ڿ� ���
		if(value != 0) System.out.print(value);
		System.out.println();
	}

}
