package set1;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name[][] = new String[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				name[i][j] = sc.next();
			}
		}

		String child = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = in.next();
		for (int i = 0; i < n; i++) {
			if (name[i][1].equals(str)) {
				child = name[i][0];
				System.out.println("Child of " + str + " : " + child);
				break;

			}
		}
		int count = 0;
		for (int i=0; i < n; i++) {
			
			if (child.equals(name[i][1])) {
				count++;

			}

		}
		System.out.println("No: of Grand children " + str + " : " + count);
	}
}