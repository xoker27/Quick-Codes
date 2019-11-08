import java.math.BigInteger;
import java.util.Scanner;
public class CuboidToCube {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int M=1000000007;
		while(T-->0) {
			int l = sc.nextInt();
			int b = sc.nextInt();
			int h = sc.nextInt();
			int gcd = gcd(l, b);
			gcd = gcd(gcd, h);
			System.out.println(gcd);
			l/=gcd;
			b/=gcd;
			h/=gcd;
			long d = ((((long) l * b) % M) * h) % M;
			System.out.println(gcd+" "+d);
		}
	}
	public static int gcd(int a,int b) {
		int t=0;
		while (b != 0) {
		    t = b;
		    b = a % b;
		    a = t;
		  }
		return a;
	}
}