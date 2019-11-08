import java.util.ArrayList;
import java.util.Scanner;

public class RKSubstrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < str.length(); i++) {
				for (int j = i + 1; j <= str.length(); j++) {
					list.add(str.substring(i, j));
				}
			}
			int rCount = 0, kCount = 0;
			int rWord = 0, kWord = 0;
			for (int i = 0; i < list.size(); i++) {
				char arr[] = list.get(i).toCharArray();
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == 'R')
						rCount++;
					else
						kCount++;
				}
				if (rCount == M)
					rWord++;
				if (kCount == N)
					kWord++;
				rCount = 0;
				kCount = 0;
			}
			System.out.println(rWord + " " + kWord);
		}
		sc.close();
	}
}
