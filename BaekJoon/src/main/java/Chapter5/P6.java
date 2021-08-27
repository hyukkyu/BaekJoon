package Chapter5;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			String[] arr = str.split("");
			int sum = 0;
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("O")) {
					count++;
					sum += count;
				} else {
					count = 0;
					sum += count;
				}
			}
			System.out.println(sum);
		}
	}

}
