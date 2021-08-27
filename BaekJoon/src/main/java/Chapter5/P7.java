package Chapter5;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr;
		
		for (int i = 0; i < n; i++) {
			int n2 = sc.nextInt();
			arr = new int[n2];
			double sum = 0;
			double result = 0;
			for (int j = 0; j < n2; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			result = sum / n2;
			
			double count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] > result) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/n2)*100);
		}
		
		
	}
}
