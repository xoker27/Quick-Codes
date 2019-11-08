import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MinimizeSumOfAlternateProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			ArrayList<Long> arr=new ArrayList<Long>();
			for(int i=0;i<N;i++)
				arr.add(sc.nextLong());
			Collections.sort(arr);
			//System.out.println(arr.toString());
			long fResult=0;
			for(int i=0;i<N/2;i++) {
				fResult+=(arr.get(i)*arr.get(N-1-i));
			}
			System.out.println(fResult);
		}
		sc.close();

	}

}
