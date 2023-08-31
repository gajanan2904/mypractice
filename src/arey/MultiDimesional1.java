package arey;

public class MultiDimesional1 {

	public static void main(String[] args) 
	{
		int matrix[][]=new int[2][2];
		
		matrix[0][0]=10;
		matrix[0][1]=20;
		matrix[1][0]=30;
		matrix[1][1]=40;
		
		for(int i=0;i<=matrix.length-1;i++)
		{
			for(int j=0;j<=matrix.length-1;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
				

	}

}
