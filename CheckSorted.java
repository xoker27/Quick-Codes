import java.util.Scanner;
public class CheckSorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			boolean flag=false;
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			for(int i=1;i<N;i++) {
				if(arr[i]<arr[i-1]) {
					flag=true;
					break;
				}
			}
			if(!flag)
				System.out.println("1");
			else
				System.out.println("0");
				
		}
	}
}
