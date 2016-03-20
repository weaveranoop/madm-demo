package MADM;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Eigen extends Matrix {
	Matrix ob=new Matrix();
	
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
		Eigen obj=new Eigen();
		obj.eigen(a, b, n);
		
	}
	public void eigen(double a[][], double b[][], int n)
	{
		double sum=0.0;
		int i, j, count=0;
		double c[]=new double[n];
		double d[]=new double[n];
		do
		{ 
			double sum_row=0;
			ob.multiply(a, b, n);
			for(i=0;i<n;i++)
				c[i]=0;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					c[i]=c[i]+b[i][j];
				}
				sum_row=sum_row+c[i];
			}
			for(i=0;i<n;i++)
			{
				d[i]=c[i]/sum_row;
				sum=sum+d[i];
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=b[i][j];
				}
			}
			count++;
		}while(count!=2);
		for(i=0;i<n;i++) {
			System.out.println(d[i]);
		}
	}
}
