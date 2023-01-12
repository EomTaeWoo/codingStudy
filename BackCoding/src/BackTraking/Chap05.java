package BackTraking;
import java.util.Scanner;

public class Chap05 {
	public static int[] arr;
	public static int n;
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		
		nQueen(0);
		System.out.println(count);
	}
	
	public static void nQueen(int depth) {
		// 모든 원소를 다 채운 상태면 count 증가 및 return
		if(depth == n) {
			count ++;
			return;
		}
		
		for(int i = 0; i < n; i ++) {
			arr[depth] = i;
			// 놓을 수 있는 위치일 경우 재귀호출
			if(Posibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}
	
	public static boolean Posibility(int col) {
		
		for(int i = 0; i < col; i ++) {
			// 해당 열의 행과 i열의 행이 일치할 경우( 같은 행에 존재할 경우)
			if(arr[col] == arr[i]) {
				return false;
			}
			
			// 대각선상에 놓여있는 경우(열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우)
			else if( Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}
}
