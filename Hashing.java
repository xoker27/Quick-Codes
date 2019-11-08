import java.util.Scanner;

public class Hashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String INITIAL = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int T = sc.nextInt();
		sc.nextLine();
		while (T-- > 0) {
			String line = sc.nextLine();
			String arr[] = line.split(" ");
			int res = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length(); j++) {
					res += j + INITIAL.indexOf(arr[i].charAt(j));
				}
			}
			System.out.println(res * (arr.length));
		}
		sc.close();
	}
}
