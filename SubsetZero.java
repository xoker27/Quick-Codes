import java.util.Scanner;

class SubsetZero {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int Z = sc.nextInt();
			int N = sc.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			int result = Z;
			for (int i = 0; i < N; i++) {
				result = result & arr[i];
				if (result == 0)
					break;
			}
			if (result == 0)
				System.out.println("Yes");
			else
				System.out.println("No");

		}
		sc.close();
	}

}