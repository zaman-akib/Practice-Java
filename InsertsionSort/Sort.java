//import java.util.*;
public class Sort {
	static void insertion_sort(int[] x)
	{
		int key,j;
		for(int i=1;i<x.length;i++)
		{
			key=x[i];
			j=i-1;
			while(j>=0 && key<x[j])
			{
				x[j+1]=x[j];
				j--;
			}
			x[j+1]=key;
		}
	}
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		int[] a= {5,3,9,1,6,8,2};
		//System.out.println(a.length);
		insertion_sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
