package set1;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x=0;
		char a[][] = new char[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(x <str.length()) {
					a[i][j] = str.charAt(x);
					x++;
				}
				System.out.printf("array[%d][%d]=%c\n",i,j, a[i][j]);
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<2) {
				if((a[i][j]=='t')&&(a[i][j+1]=='o')&&(a[i][j+2]=='o')) {
					 System.out.printf("it starts at %d,%d\n",i,j);
					 System.out.printf("it ends at %d,%d\n",i,j+2);
				}}
				if(i<2) {
				if((a[i][j]=='t')&&(a[i+1][j]=='o')&&(a[i+2][j]=='o')) {
					 System.out.printf("it starts at %d,%d\n",i,j);
					 System.out.printf("it ends at %d,%d\n",i+2,j);
				}}
				
			}
		}
	}

}
