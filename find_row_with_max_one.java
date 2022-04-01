//Find row with maximum no. of 1's
public class find_row_with_max_one
{
	public static int rowmatrixwithone(int matrix[][])
	{
		int row = 4;
		int col = 4;
		int j = col-1;
		int max_with_one = 0;

		for(int i=0; i<row; i++)
		{
			while(j>=0 && matrix[i][j]==1)
			{
				j=j-1;
				max_with_one = i;
			}
		}
		if(max_with_one==0&&matrix[0][col-1]==0)
              return -1;
		return max_with_one;
	}
	public static void main(String[] args) {
		int matrix[][] = {{0,0,0,1},
						{0,1,1,1},
						{1,1,1,1},
						{0,0,0,0}};

		System.out.println("Row with maximum no. of 1's: "+rowmatrixwithone(matrix));
	}
}