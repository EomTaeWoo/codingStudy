package Chap01;

import java.util.Scanner;

public class Programers_01 {

	public static String solution(String str) {
		String answer = str;
		// 1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		answer = answer.toLowerCase();
		//2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		/*
		String charRemove = "!@#*";
		for(char c : charRemove.toCharArray()) {
			answer = answer.replace(String.valueOf(c),"");
		}
		*/
		answer = answer.replaceAll("[^a-z0-9-_.]","");
		// 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		//answer = answer.replace("...", ".").replace("..", ".");
		answer = answer.replaceAll("\\.{2,}", ".");
		// 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		/*
		if(answer.charAt(0) == '.' || answer.charAt(answer.length()-1) == '.') {
			answer = answer.replaceFirst(".", "");
			answer = answer.replaceAll(".$", "");
		}
		*/
		answer = answer.replaceAll("^\\.|\\.$", "");
		// 5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
		//answer = answer.replace(" ", "a");
		if (answer.equals("")) {
            answer = "a";
        }
		//6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
	    //���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		if(answer.length() >= 16) {
			answer = answer.substring(0,15);
			answer = answer.replaceAll("\\.$", ""); // ������ ���ڰ� ��ħǥ(.)�� ��� ����
		}
		//if(answer.charAt(answer.length()-1) == '.') {
		//	answer = answer.replaceAll(".$", "");
		//}
		// 7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		//if(answer.length() <= 2) {
		//	answer += answer.charAt(answer.length()-1);
		//}
		while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
		return answer;
	}
	public static void main(String[] args) {
		Programers_01 T = new Programers_01();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));

	}

}
