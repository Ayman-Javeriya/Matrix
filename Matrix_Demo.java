//taking input and printing output of a matrix:
import java.util.*;
public class Matrix_Demo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//row and colmns number as input
		System.out.println("Enter Row Numbers:");
		int rows = sc.nextInt();
		System.out.println("Enter Columns Numbers:");
		int cols = sc.nextInt();

		//declaring matrix
		int[][] matrix = new int[rows][cols];

		//taking data of matrix as input
		System.out.println("Input Matrix data: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		//printing matrix
		System.out.println("Matrix");	
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();		
		}
	}
}