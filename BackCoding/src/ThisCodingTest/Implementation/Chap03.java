package ThisCodingTest.Implementation;

import java.util.Scanner;

public class Chap03 {

	public static void main(String[] args) {
		// �ս��� ����Ʈ ����
		/*
		�ູ �ձ��� �ս� ������ ü���ǰ� ���� 8 * 8 ����Դϴ�. �ս� ������ Ư���� �� ĭ�� ����Ʈ�� ���ֽ��ϴ�.
		����Ʈ�� �ſ� �漺������ ���Ϸμ� ���� ������ �����մϴ�.
		����Ʈ�� ���� Ÿ�� �ֱ� ������ �̵��� ���� L�� ���·θ� �̵��� �� ������ ���� �����δ� ���� �� �����ϴ�.
		����Ʈ�� Ư�� ��ġ���� ������ ���� 2���� ���� �̵��� �� �ֽ��ϴ�.
		1. �������� �� ĭ �̵��� �ڿ� �������� �� ĭ �̵��ϱ�
		2. �������� �� ĭ �̵��� �ڿ� �������� �� ĭ �̵��ϱ�
		*/
		Scanner sc = new Scanner(System.in);
		
		//���� ����Ʈ�� ��ġ �Է¹ޱ�
		String inputData = sc.nextLine();
		int row = inputData.charAt(1) - '0';
		int column = inputData.charAt(0) - 'a' + 1;
		
		//����Ʈ�� �̵��� �� �ִ� 8���� ���� ����
		int[] dx = {-2,-1,1,2,2,1,-1,-2};
		int[] dy = {-1,-2,-2,-1,1,2,2,1};
		
		//8���� ���⿡ ���Ͽ� �� ��ġ�� �̵��� �������� Ȯ��
		int result = 0;
		for(int i = 0; i < 8; i ++) {
			//�̵��ϰ��� �ϴ� ��ġ Ȯ��
			int nextRow = row + dx[i];
			int nextColumn = column + dy[i];
			//�ش� ��ġ�� �̵��� �����ϴٸ� ī��Ʈ ����
			if(nextRow >= 1 && nextRow <= 8 && nextColumn >=1 && nextColumn <= 8) {
				result += 1;
			}
		}
		System.out.println(result);
	}

}
