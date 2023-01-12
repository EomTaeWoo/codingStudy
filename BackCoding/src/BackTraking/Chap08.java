package BackTraking;

import java.util.Scanner;

public class Chap08 {
	static int n;
	static int[][] map;
	static boolean[] visit;
	
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n][n];
		visit = new boolean[n];
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j ++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		combi(0,0);
		System.out.println(min);
	}
	
	// idx�� �ε���, count�� ���� ����(=��� ����)
	static void combi(int idx, int count) {
		// �� ������ �ϼ��� ���
		if(count == n / 2) {
			/**
			 * �湮�� ���� �湮���� ���� ���� ���� ������
			 * �� ���� ������ ���� �� �ּڰ��� ã�´�.
			 */
			diff();
			return;
		}
		
		for(int i = idx; i < n; i++) {
			//�湮���� �ʾҴٸ�
			if(!visit[i]) {
				visit[i] = true;		// �湮���� ����
				combi(i + 1, count + 1);	// ���ȣ��
				visit[i] = false;			// ��Ͱ� ������ ��湮���� ����
			}
		}
	}
	
	// �� ���� �ɷ�ġ ������ ����ϴ� �Լ�
	static void diff() {
		int team_start = 0;
		int team_link = 0;
		
		for(int i = 0; i < n-1; i ++) {
			for(int j = i + 1; j < n; j ++) {
				// i ��° ����� j ��° ����� true��� ��ŸƮ������ ���� �÷���
				if(visit[i] == true && visit[j] == true) {
					team_start += map[i][j];
					team_start += map[j][i];
				}
				// i ��° ����� j ��° ����� false��� ��ũ������ ���� �÷���
				else if (visit[i] == false && visit[j] == false) {
					team_link += map[i][j];
					team_link += map[j][i];
				}
			}
		}
		// �� �������� ����(���밪)
		int val = Math.abs(team_start - team_link);
		
		/**
		 * �� ���� �������� 0�̶�� ���� ���� �ּڰ��̱� ������
		 * �� �̻��� Ž�� �ʿ���� 0�� ����ϰ� �����ϸ� �ȴ�.
		 */
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		min = Math.min(val, min);
	}
}
