import java.util.Scanner;
import java.util.HashMap;
public class NumberOfOccurance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int K=sc.nextInt();
			HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
			while(N-->0) {
				int temp=sc.nextInt();
				if(map.get(temp)==null)
					map.put(temp,1);
				else {
					int value=map.get(temp);
					map.put(temp,value+1);
				}
			}
			if(map.get(K)==null)
				System.out.println(-1);
			else
				System.out.println(map.get(K));
		}
	}
}
