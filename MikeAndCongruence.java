import java.util.Scanner;
public class MikeAndCongruence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long k=sc.nextLong();
		long arr[]=new long[(int)N];
		for(int i=1,j=0;i<=N;i++,j++) {
			arr[(int)j]=(i%k);
		}
		long count=0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(arr[i]==arr[j])
					count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
