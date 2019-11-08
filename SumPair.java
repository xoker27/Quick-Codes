import java.util.Scanner;

public class SumPair {
	private static final int MAX = 1000000;
	static void printpairs(int arr[], int sum) {
		boolean[] binmap = new boolean[MAX];
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if (temp >= 0 && binmap[temp]) {
				System.out.println("YES");
				flag = true;
				break;
			}
			binmap[arr[i]] = true;
		}
		if (!flag)
			System.out.println("NO");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		printpairs(arr, K);
	}
}