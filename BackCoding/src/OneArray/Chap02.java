package OneArray;

import java.util.Scanner;


public class Chap02 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[9];
		int index = 0;
		int max = 0;
		
		for(int i = 0; i < 9; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < 9; i++) {
			if(array[i]>max) {
				max = array[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
