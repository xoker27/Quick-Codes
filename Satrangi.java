import java.util.Scanner;
public class Satrangi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			int result=0;
			while(A > 1 && B > 1) {
				 if(A>B) {
				  result = result + A / B;
				  A = (A % B);
				 }
				 else {
				  result = result + B / A;
				  B = (B % A);
				 }
			}
			System.out.println(result);
		}
	}
}
