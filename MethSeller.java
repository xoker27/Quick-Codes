import java.util.HashMap;
import java.util.Scanner;
public class MethSeller {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String str[]=new String[N];
		HashMap<String, Integer> map = new HashMap<String,Integer>(N);
		sc.nextLine();
		for(int i=0;i<str.length;i++) {
			str[i]=sc.nextLine();
			map.put(str[i],i);
		}
		int cost[][]=new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				cost[i][j]=sc.nextInt();
			}
		}
		int P = sc.nextInt();
		int prev = 0;
		long sum = 0;
		String str2;
		sc.nextLine();
		for(int i=0;i<P;i++){
			str2=sc.nextLine();
			int val=map.get(str2);
			sum += cost[prev][val];
			prev = val;
		}
		System.out.println(sum);
		sc.close();
	}
}
