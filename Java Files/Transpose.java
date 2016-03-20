package MADM;
import java.io.*;
public class Transpose {

public static void main(String ar[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,j;
	System.out.println("Enter the size of matrix");
	int m=Integer.parseInt(br.readLine());
	int n=Integer.parseInt(br.readLine());
	double a[][]=new double[m][n];
	double b[][]=new double[n][m];
	for(i=0;i<m;i++)
	{
		System.out.println("Enter the rows");
		for(j=0;j<n;j++)
		{
			a[i][j]=Double.parseDouble(br.readLine());
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			b[i][j]=a[j][i];
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			System.out.print(b[i][j]+" ");	
		}
		System.out.println();
	}
}	
}