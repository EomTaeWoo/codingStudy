package Programmers.ThirdWeek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Chap02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// �ֹ� Ŭ����
	class Citizen {
	    final boolean isBadBoy;
	    final List<Integer> contacts = new ArrayList<>();
	    int received = 0;

	    public Citizen(boolean isBadBoy) {
	        this.isBadBoy = isBadBoy;
	    }
	}

    public int solution(int n, int c, int k, int[][] contact) {
        List<Citizen> citizens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            citizens.add(new Citizen(i < c)); // i < c �̸� �ǵ�Ŭ��
        }

        for (int[] cont : contact) {
            // �ֹ� ��ȣ�� index�� ó���ϱ� ���� -1 �� ���ݴϴ�
            citizens.get(cont[0] - 1).contacts.add(cont[1] - 1);
        }

        Queue<Citizen> queue = new LinkedList<>();
        for (Citizen citizen : citizens) {
            if (citizen.isBadBoy) queue.offer(citizen);
        }

        while (!queue.isEmpty()) {
            Citizen cur = queue.poll();

            // ����ó�� �ִ� �ֹε��� ������� ����
            for (int i : cur.contacts) {
                Citizen receiver = citizens.get(i);
                if (receiver.received == k) continue; // k ��ŭ ��������� �н�

                receiver.received += 1;
                if (receiver.received == k) {
                    // k��ŭ ������ ������ ����� ������ �����ϴ�
                    queue.offer(receiver);
                }
            }
        }

        int answer = 0;
        for (Citizen citizen : citizens) {
            if (citizen.isBadBoy) continue; // �ǵ�Ŭ���� ī��Ʈ���� �����ؾ� �մϴ�.
            if (citizen.received == 0) answer += 1;
        }
        return answer;
    }

}
