import java.util.Scanner;

public class StupidMadhav {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			long N = sc.nextLong();
			N %= 1000000007;
			long res = (N * (1 + ((N - 1) * 2))) % 1000000007;
			System.out.println(res);
		}
	}
}
