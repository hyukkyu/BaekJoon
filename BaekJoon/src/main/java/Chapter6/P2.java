package Chapter6;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int a = d(i);
			if (a < 10001) {
				check[a] = true;
			}
		}
		
		for (int j = 1; j < 10001; j++) {
			if (!check[j]) {
				System.out.println(j);
			}
		}
	}
	
	public static int d(int n) {
		int sum = n;
		
		while(n > 0) {
			sum += sum % 10;
			n = n / 10;
		}
		
		return sum;
	}
}
