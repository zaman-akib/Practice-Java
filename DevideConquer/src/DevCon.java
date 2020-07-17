
public class DevCon {
	
	static int Max_Crossarray(int A[],int low,int mid,int high)
	{
		int sum=0;
		int left_sum=Integer.MIN_VALUE;
		for(int i=mid;i>=low;i--)
		{
			sum=sum+A[i];
			if(sum>left_sum)
				left_sum=sum;
		}
		sum=0;
		int right_sum=Integer.MIN_VALUE;
		for(int i=mid+1;i<=high;i++)
		{
			sum=sum+A[i];
			if(sum>right_sum)
				right_sum=sum;
		}
		return left_sum+right_sum;
	}
	
	static int Max_Subarray(int[] A,int low,int high)
	{
		if(low==high)
			return A[low];
		int mid=(high+low)/2;
		int left_sum=Max_Subarray(A,low,mid);
		int right_sum=Max_Subarray(A,mid+1,high);
		int cross_sum=Max_Crossarray(A,low,mid,high);
		return Math.max(Math.max(left_sum, right_sum), cross_sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,-4,3,2};
		int result=Max_Subarray(a,0,a.length-1);
		System.out.println(result);

	}

}
