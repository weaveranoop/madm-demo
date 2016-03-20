package MADM;
import java.io.*;
public class Matrix {
public static void main(String ar[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,j;
	System.out.println("Enter the size of square matrix");
	int n=Integer.parseInt(br.readLine());
	double a[][]=new double[n][n];
	double b[][]=new double[n][n];
	for(i=0;i<n;i++)
	{
		System.out.println("Enter the rows");
		for(j=0;j<n;j++)
		{
			a[i][j]=Double.parseDouble(br.readLine());
		}
	}
	Matrix ob=new Matrix();
	ob.multiply(a, b, n);
}
public void multiply(double a[][], double b[][], int n)
{
	int i,j,k;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			b[i][j]=0;
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			for(k=0;k<n;k++)
			b[i][j]=b[i][j]+a[i][k]*a[k][j];
		}
	}
	/* for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	} */
}
}
