package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chap06_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		
		// st �� ������ �������� ���� ��ū���� st�� �����Ѵ�.
		StringTokenizer st = new StringTokenizer(text," ");
		
		// countToken() �� ��ū�� ������ ��ȯ�Ѵ�.
		System.out.println(st.countTokens());
	}

}
