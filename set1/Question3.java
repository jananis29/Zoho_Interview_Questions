package set1;
/*3. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.

w	e	L	C	O
M	E	T	O	Z
O	H	O	C	O
R	P	O	R	A
T	I	O	n	  
And print the start and ending index as

Start index : <1,2>

End index: <3, 2>

https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
*/
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
