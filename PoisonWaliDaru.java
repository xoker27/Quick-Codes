import java.util.Scanner;
public class PoisonWaliDaru {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int X=sc.nextInt();
			int count=1;
			for(int i=2;i<=X;i++) {
				if(X%i==0)
					count++;
				if(count>=4)
				    break;
			}
			if(count<4)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
