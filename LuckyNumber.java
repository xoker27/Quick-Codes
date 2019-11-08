import java.util.Scanner;
public class LuckyNumber {
	
	static int position=2;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			System.out.println(isLucky(N));
			position=2;
		}
		sc.close();
	}
	
	public static String isLucky(int N) {
		if(N<position)
			return "Lucky";
		if(N%position == 0)
			return "Not Lucky";
		N-=(N/position);
		position++;
		return isLucky(N);
	}

}
