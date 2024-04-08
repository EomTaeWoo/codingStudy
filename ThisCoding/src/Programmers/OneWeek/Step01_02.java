package Programmers.OneWeek;

// ������ ����
public class Step01_02 {

	public static void main(String[] args) {
		int[][] cost = {{0, 10}, {50, 20}, {100, 30}, {200, 40}};
        int[][] order = {{3, 50}, {7, 200}, {8, 200}};
        
        int result = solution(cost, order);
        System.out.println("�ּ� ������: " + result);

	}
	
	public static int solution(int[][] cost, int[][] order) {
		int answer = 0;

        int maxMonth = 0;
        for (int[] o : order) maxMonth = Math.max(maxMonth, o[0]);

        int[] monthlyOrder = new int[maxMonth];
        int need = 0;
        int made = 0;
        for (int[] o : order) {
            // order �迭�� ���ĵǾ� ���� ������ �����ϼ���.
            monthlyOrder[o[0] - 1] += o[1]; // ���� index�� ����ϱ� ���� -1�� ���ݴϴ�
            need += o[1];
        }

        for (int i = 0; i < cost.length - 1; i++) {
            if (need == 0 || made >= need) break;

            int price = cost[i][1];
            int limit = cost[i + 1][0] - cost[i][0];
            int rest = 0;

            for (int j = 0; j < maxMonth; j++) {
                if (need == 0 || made >= need) break;

                int making = Math.min(limit, need - made);

                answer += making * price;
                made += making;
                need -= monthlyOrder[j];

                if (monthlyOrder[j] == 0) continue; // ��ǰ�� ���ص� �˴ϴ�.

                int delivery = Math.min(made, monthlyOrder[j]);

                // ��ǰ�Ҷ��� �Ǹ� �������� �Ϳ��� ���ݴϴ�.
                made -= delivery;
                monthlyOrder[j] -= delivery;
                rest += monthlyOrder[j]; // ��ǰ�ϰ� �������� ������������ ������ �մϴ�.
            }

            need = rest;
            made = 0;
        }

        // ������ �͵��� ���������� ������ �����մϴ�.
        answer += need * cost[cost.length - 1][1];
        return answer;
    }

}
