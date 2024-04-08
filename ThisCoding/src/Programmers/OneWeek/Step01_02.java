package Programmers.OneWeek;

// 자전거 공장
public class Step01_02 {

	public static void main(String[] args) {
		int[][] cost = {{0, 10}, {50, 20}, {100, 30}, {200, 40}};
        int[][] order = {{3, 50}, {7, 200}, {8, 200}};
        
        int result = solution(cost, order);
        System.out.println("최소 전기요금: " + result);

	}
	
	public static int solution(int[][] cost, int[][] order) {
		int answer = 0;

        int maxMonth = 0;
        for (int[] o : order) maxMonth = Math.max(maxMonth, o[0]);

        int[] monthlyOrder = new int[maxMonth];
        int need = 0;
        int made = 0;
        for (int[] o : order) {
            // order 배열이 정렬되어 있지 않음에 주의하세요.
            monthlyOrder[o[0] - 1] += o[1]; // 월을 index로 사용하기 위해 -1을 해줍니다
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

                if (monthlyOrder[j] == 0) continue; // 납품을 안해도 됩니다.

                int delivery = Math.min(made, monthlyOrder[j]);

                // 납품할때가 되면 만들어놓은 것에서 빼줍니다.
                made -= delivery;
                monthlyOrder[j] -= delivery;
                rest += monthlyOrder[j]; // 납품하고도 남은것은 다음구간에서 만들어야 합니다.
            }

            need = rest;
            made = 0;
        }

        // 나머지 것들은 최종구간의 가격을 적용합니다.
        answer += need * cost[cost.length - 1][1];
        return answer;
    }

}
