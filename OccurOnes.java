import java.util.Scanner;
public class OccurOnes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			if(arr.length==1)
			    System.out.println(arr[0]);
			else if(arr[0]!=arr[1])
				System.out.println(arr[0]);
			else if(arr[N-1]!=arr[N-2])
				System.out.println(arr[N-1]);
			else
				System.out.println(occurOne(arr,2,N-3));
		}
	}
	public static int occurOne(int arr[],int low,int high) {
		int mid=(low+high)/2;
		if(low>high)
			return 0;
		if(mid%2==0) {
			if(arr[mid]==arr[mid+1])
				return occurOne(arr,mid+1,high);
			else if(arr[mid]==arr[mid-1])
				return occurOne(arr,low,mid-1);
			else
				return arr[mid];
		}
		else {
			if(arr[mid]==arr[mid+1])
				return occurOne(arr,low,mid-1);
			else if(arr[mid]==arr[mid-1])
				return occurOne(arr,mid+1,high);
			else
				return arr[mid];
		}
	}
}
