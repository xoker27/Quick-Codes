import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<arr.length;i++)
				arr[i]=sc.nextInt();
			int sum=sc.nextInt();
			boolean flag=true;
			for(int i=0;i<Math.pow(2, N);i++) {
				int subSum=0;
				for(int j=0;j<N;j++) {
					if(((1<<j)&i) !=0) {
						subSum+=arr[j];
					}
				}
				if(subSum==sum) {
					System.out.println("YES");
					flag=!flag;
					break;
				}
			}
			if(flag)
				System.out.println("NO");
		}
	}
}
