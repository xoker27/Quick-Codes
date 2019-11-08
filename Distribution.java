import java.math.BigInteger;
import java.util.Scanner;
class Distribution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();
        if(N>R) {
	        BigInteger res=factorial(N-1).divide(factorial(R-1).multiply(factorial(N-R)));
	        System.out.println(res);
        }
        else
        	System.out.println("-1");
    }
    public static BigInteger factorial(int N) {
    	BigInteger fact=BigInteger.ONE;
    	for(int i=2;i<=N;i++)
    		fact=fact.multiply(new BigInteger(String.valueOf(i)));
    	//System.out.println(fact);
    	return fact.mod(new BigInteger(String.valueOf(10000007)));
    }
}
