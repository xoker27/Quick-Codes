import java.util.Scanner;
public class BitonicArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			if(arr[N-1]>arr[N-2])
				System.out.println(arr[N-1]);
			else
				System.out.println(maxValue(arr,0,N));
		}
		sc.close();
	}

	public static int maxValue(int arr[], int low, int high) {
		int mid=(low+high)/2;
		if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
			return arr[mid];
		else {
			if(arr[mid]>arr[mid-1])
				return maxValue(arr,mid,high);
			else
				return maxValue(arr,low,mid);
		}
	}
}
