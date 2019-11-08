import java.util.Scanner;

class QueryMultiples {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		while (Q-- > 0) {
			int count = 0;
			int index = sc.nextInt() - 1;
			int X = sc.nextInt();
			for (int i = index; i < arr.length; i++) {
				if (arr[i] % X == 0)
					count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
}
