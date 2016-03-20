package MADM;
import java.io.*;
public class Multiply {

public static void main(String ar[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,j;
	System.out.println("Enter the sizes");
	int m=Integer.parseInt(br.readLine());
	int n=Integer.parseInt(br.readLine());
	int p=Integer.parseInt(br.readLine());
	double a[][]=new double[m][n];
	double b[][]=new double[n][p];
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
		System.out.println("Enter the rows");
		for(j=0;j<p;j++)
		{
			b[i][j]=Double.parseDouble(br.readLine());
		}
	}
	Multiply obj=new Multiply();
	obj.multiply(a, b, m, n, p);
}
public void multiply(double a[][], double b[][], int m, int n, int p)
{
	int i,j,k;
	double c[][]=new double[m][p];
	for(i=0;i<m;i++)
	{
		for(j=0;j<p;j++)
		{
			c[i][j]=0;
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<p;j++)
		{
			for(k=0;k<n;k++)
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		}
	}
		for(i=0;i<m;i++)
		{
			for(j=0;j<p;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		} 
}
}
