package Programmers.OneWeek;

public class Step03_02 {

	public static void main(String[] args) {
		long answer = solution(43, new int[] {5,3,7,6,4});
		System.out.println(answer);

	}
	
	public static long solution(int goal, int[] durations) {
        int maxDuration = 0; // ���� ���� �ɸ��� �ð�
        for (int d : durations) maxDuration = Math.max(maxDuration, d);

        long hours = finishHours(goal, durations, maxDuration);
        return calcPay(hours, durations, maxDuration);
    }

    private static long finishHours(int goal, int[] durations, int maxDuration) {
        long min = 0;
        // �ִ�� �ɸ��� �ð��� ��� �۾��ڰ� ���� ���� �ɸ��� �ð���ŭ �۾��ϴ� ���
        // ��ǥ���� �۾��� ���� ������ �Ҽ��� ������ ����ϱ� 1�� ���� �˳��� �ִ밪�� ����� ��
        long max = maxDuration * (goal / durations.length + 1L);

        while (min < max) {
            long mid = (min + max) / 2;

            int count = 0;
            for (int d : durations) count += mid / d;

            if (count < goal) min = mid + 1;
            else max = mid;
        }

        return max;
    }

    private static long calcPay(long hours, int[] durations, int maxDuration) {
        // ���� ���� ������ ������ �۾��ð��� ���� ���� �ɸ��� �۾��ڰ� ���� ���
        long minCount = hours / maxDuration;

        long incentive = 0;
        for (int d : durations) {
            incentive += hours / d - minCount;
        }
        return incentive * 10_000L; // �� �� 10,000��;
    }

}
