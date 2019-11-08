import java.util.Scanner;
public class GoodPairs {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			int pairs=0,lastPair=0;
			for(int i=1;i<N;i++) {
				if(arr[i] == arr[i-1])
					pairs+= lastPair;
		         else{
		        	 pairs += i;
		             lastPair = i;
		         }   
		     }
			System.out.println(pairs);
		}
	}
}
