import java.util.Scanner;
public class ExtraIndex {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			int arr2[]=new int[N-1];
			for(int i=0;i<N;i++)
				arr[i]=sc.nextInt();
			for(int i=0;i<N-1;i++)
				arr2[i]=sc.nextInt();
			for(int i=0;i<N-1;i++) {
				if(arr[i] == arr2[i])
					continue;
				System.out.println(i);
				break;
			}
			
		}
		sc.close();
	}
}
