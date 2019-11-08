import java.util.Scanner;
import java.math.BigInteger;
public class NumberPowerMod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int x,k,m;
		BigInteger result;
		while(T-->0) {
			x=sc.nextInt();
			k=sc.nextInt();
			m=sc.nextInt();
			//System.out.println(x+" "+" "+m+" "+k);
			result=new BigInteger(String.valueOf(x));
			//System.out.println(result);
			for(int i=1;i<=k;i++) {
				result=result.pow(x);
			}
			result=result.mod(new BigInteger(String.valueOf(m)));
			System.out.println(result);
		}
		
	}
}
