package set1;
/*
4. Given a 9×9 sudoku we have to evaluate it for its correctness.
We have to check both the sub matrix correctness and the whole sudoku correctness.

https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
*/
import java.util.*;

public class Question4 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[9][9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<9;i++) {
			sum=0;
			for(int j=0;j<9;j++) {
				sum += a[i][j];
			}
			if(sum!= 45) {
				System.out.println("Not Valid Sudoku");
				System.exit(0);
			}
		}
		for(int i=0;i<9;i++) {
			sum=0;
			for(int j=0;j<9;j++) {
				sum += a[j][i];
			}
			if(sum!= 45) {
				System.out.println("Not Valid Sudoku");
				System.exit(0);
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum=0;
				for(int k=0;k<3;k++)
				{
					for(int l=0;l<3;l++)
					sum=sum+a[i*3+k][j*3+l];
				}
				
				if(sum!=45)
				{
					System.out.print("Not Valid Sudoku");
		            System.exit(0);
				}
				
			}
		
	}
		System.out.print("Valid Sudoku ");

	}
}
