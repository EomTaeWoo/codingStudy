package Programmers.OneWeek;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Step04_02 {

	public static void main(String[] args) {
		long answer = solution(new int[] {0,1,1,0,1,1}, 3);
		System.out.println(answer);

	}
	
	public static int solution(int[] coin, int k) {
        // ������ �ϳ��� ������ �ʿ� ����
        if (coin.length == 1) return 0;

        int sum = IntStream.of(coin).sum();
        // ��� 0�̸� sum�� 0, ��� 1�� �� sum�� coin.length
        if (sum == 0 || sum == coin.length) return 0; // ������ �ʿ� ����
        if (sum != k && coin.length == k) return -1; // �Ұ�

        // flipCoins �� ���޵Ǵ� �迭�� ������ ����Ǳ� ������ Arrays.copyOf �� �迭�� ���纻�� �����մϴ�.
        int makeAll0 = flipCoins(Arrays.copyOf(coin, coin.length), k, 0); // ��� 0���� ���� ���
        int makeAll1 = flipCoins(Arrays.copyOf(coin, coin.length), k, 1); // ��� 1�� ���� ���
        int answer = Math.min(makeAll0, makeAll1);
        if (answer == Integer.MAX_VALUE) return -1;
        return answer;
    }

    static int flipCoins(int[] coin, int k, int t) {
        int ret = 0;

        for (int i = 0; i < coin.length - k + 1; i++) {
            if (coin[i] == t) continue; // �̹� ���ϴ� ���� ��� ��ŵ

            for (int j = 0; j < k; j++) {
                coin[i + j] = 1 - coin[i + j]; // ������ : 0 -> 1, 1 -> 0
            }

            ret += 1; // ������ Ƚ��
        }

        int count = 0;
        for (int c : coin) if (c == t) count += 1; // ���ϴ� ���� ���� ����

        if (count == coin.length) return ret;
        return Integer.MAX_VALUE;
    }

}
