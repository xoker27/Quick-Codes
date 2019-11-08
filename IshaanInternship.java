import java.util.Scanner;
public class IshaanInternship {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			int count=0;
			while(N>=K) {
				N/=K;
				count++;
			}
			System.out.println((int)(Math.pow(K,count)));
		}
	}

}
