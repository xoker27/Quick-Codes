import java.util.Scanner;
import java.util.Arrays;
public class ElementsInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int A=sc.nextInt();
			int B=sc.nextInt();
			int arr[]=new int[N];
			int res=0;
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
				//Approach 1:
				if(arr[i]>=A && arr[i]<=B)
					res++;
			}
			if(res==(B-A+1))
				System.out.println("Yes");
			else
				System.out.print("No");
			//Approch 2:
			/*
			Arrays.sort(arr);
			if(checkInRange(arr,N,A,B))
				System.out.println("Yes");
			else
				System.out.print("No");
			*/
		}
	}
	
	public static boolean checkInRange(int arr[],int N,int A,int B) {
	    if(B==A-1)
	        return true;
		if(arr[N-1]==B && N-1>0)
			return checkInRange(arr,N-1,A,B-1);
		else if(arr[N-1]>B && N-1>0)
			return checkInRange(arr,N-1,A,B);
		else
		    return false;
	}
}
