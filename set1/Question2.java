package set1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[]= new int[n];
		for(int i=0;i<n;i++) {
			num[i]= sc.nextInt();
		}

		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		int[] wegArray = new int[n];

		for (int i = 0; i < n; i++) {
			wegArray[i] = 0;
			int sq = (int) Math.sqrt(num[i]);
			if ((sq * sq) == num[i])
				wegArray[i] = wegArray[i] + 5;

			if (num[i] % 4 == 0 && num[i] % 6 == 0)
				wegArray[i] = wegArray[i] + 4;

			if (num[i] % 2 == 0)
				wegArray[i] = wegArray[i] + 3;

		}

		for (int i = 0; i < n; i++)
			System.out.print("<" + num[i]+"," + wegArray[i] + ">");
	}

}
