package Chapter01;

public class Q01 {

	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coinType = {500,100,50,10};
		
		for (int i=0; i < coinType.length; i++) {
			cnt += n / coinType[i];
			n %= coinType[i];
		}
		System.out.println(cnt);

	}

}
