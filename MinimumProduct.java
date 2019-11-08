import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MinimumProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			ArrayList<Integer> arr1=new ArrayList<Integer>();
			ArrayList<Integer> arr2=new ArrayList<Integer>();
			for(int i=0;i<N;i++)
				arr1.add(sc.nextInt());
			for(int i=0;i<N;i++)
				arr2.add(sc.nextInt());
			Collections.sort(arr1);
			Collections.sort(arr2, Collections.reverseOrder());
			int res=0;
			for(int i=0;i<N;i++) {
				res+=(arr1.get(i)*arr2.get(i));
			}
			System.out.println(res);
		}
		sc.close();
	}

}
