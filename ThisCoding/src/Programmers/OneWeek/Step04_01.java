package Programmers.OneWeek;

import java.util.Arrays;

// ���ڰ���
public class Step04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] A, int[] B) {
		Arrays.sort(B);
		
		int answer = 0;
		// ���� ������ ���� �ϳ��� ����ؾ���
		for(int i = 0; i < A.length; i ++){
            for(int j = 0; j < B.length; j ++){
                if(A[i] < B[j]){
                    answer += 1;
                    B[j] = 0;
                    break;
                }
            }
        }
		
		// A�� sort�� �س��� B�� �����ϴ� ���
		// ������ �Ųٷ� ���鼭 ū ���ں��� ��
		Arrays.sort(B);
		Arrays.sort(A);
		int index = B.length - 1;
		for(int i = A.length-1; i>=0; i --) {
			if(A[i] < B[index]) {
				index--;
				answer ++;
			}
		}
		return answer;
	}

}
