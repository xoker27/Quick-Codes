import java.util.Scanner;
public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N-1];
			int sum=0;
			for(int i=0;i<N-1;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			System.out.println((N*(N+1))/2 - sum);
		}
	}

}
