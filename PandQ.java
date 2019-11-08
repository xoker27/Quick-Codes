import java.util.Scanner;
public class PandQ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long T=sc.nextLong();
		while(T-->0) {
			long A=sc.nextLong();
			long B=sc.nextLong();
			long max=0;
			for(long P=A;P<=B;P++) {
				for(long Q=P+1;Q<=B;Q++) {
					if((P&Q) > max)
						max=(P&Q);
				}
			}
			System.out.println(max);
		}
	}
}
