package Chapter02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // ����(5) - ����(2) - ����(3) - ����(7) - ����() - ����(1) - ����(4) - ����()
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();
        q.offer(1);
        q.offer(4);
        q.poll();
        // ���� ���� ���Һ��� ����
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
