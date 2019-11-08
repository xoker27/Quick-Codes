import java.util.Scanner;
public class CommonDivisors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long T=sc.nextLong();
		while(T-->0) {
			long N1=sc.nextLong();
			long N2=sc.nextLong();
			long N3=sc.nextLong();
			long max=gcd(N1, gcd(N2, N3));
			long count=1;
			for(long i=2;i<=max;i++) {
				if(N1%i==0 && N2%i==0 && N3%i==0)
					count++;
			}
			System.out.println(count);
		}
	}
	public static long gcd(long a,long b) {
		while(b!=0) {
			long temp=a;
			a=a%b;
			b=temp;
		}
		return a;
	}
}
