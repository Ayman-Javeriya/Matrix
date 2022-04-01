//Search an element in a matriix
import java.util.*;
public class search_element
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

		//no to be search
		System.out.println("Enter no to be search: ");
		int x = sc.nextInt();

		//traver matrix to search element
		for(int i =0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(matrix[i][j] == x)
					System.out.println("Element found at location ["+i+","+j+"]");
			}
		}

	}


}