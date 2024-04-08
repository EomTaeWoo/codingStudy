package Programmers.OneWeek;

import java.util.Arrays;

// 숫자게임
public class Step04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] A, int[] B) {
		Arrays.sort(B);
		
		int answer = 0;
		// 이중 루프라서 루프 하나로 고민해야함
		for(int i = 0; i < A.length; i ++){
            for(int j = 0; j < B.length; j ++){
                if(A[i] < B[j]){
                    answer += 1;
                    B[j] = 0;
                    break;
                }
            }
        }
		
		// A도 sort를 해놓고 B를 제거하는 방식
		// 루프를 거꾸로 돌면서 큰 숫자부터 비교
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
