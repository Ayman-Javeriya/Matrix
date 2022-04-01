//Spiral Traverse on Matrix
public class Spiral_Traverse
{
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		int row = 4;
		int col = 4;

		//pointers to traverse in matrix
		int top = 0;
		int bottom = row-1;
		int left = 0;
		int right = col-1;

		//traversing from 1st row to last and 1st colmnto last colmn
		System.out.println("Spiral Traversal Of Matrix: ");
		while(top <= bottom && left <= right)
		{
			//printing 1st row
			for(int i=left; i<=right; i++)
				System.out.print(matrix[top][i]+" ");
			top++;

			//printing last colmn
			for(int i=top; i<=bottom; i++)
				System.out.print(matrix[i][right]+" ");
			right--;

			//printing last rows
			for(int i=right; i>=left; i--)
				System.out.print(matrix[bottom][i]+" ");
			bottom--;

			//pritning elements of bottom to top
			for(int i=bottom; i>=top; i--)
				System.out.print(matrix[i][left]+" ");
			left++;

		}

		


	}
}