import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			int K=sc.nextInt();
			System.out.println(binarySearch(arr,0,N-1,K));
		}
	}
	
	public static int binarySearch(int arr[],int L,int H,int K) {
		if(L>H)
			return -1;
		int mid=(L+H)/2;
		if(arr[mid]==K)
			return mid;
		else if(arr[mid]>K)
			return binarySearch(arr,L,mid-1,K);
		else
			return binarySearch(arr,mid+1,H,K);
		
	}

}
