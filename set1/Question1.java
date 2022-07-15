package set1;

/* 1. Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 

https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
*/
import java.util.*;

public class Question1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print(str.charAt(i));
				}else if ((i+j) == (n-1)) {
					System.out.print(str.charAt(n-i-1));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
