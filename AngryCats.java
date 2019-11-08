import java.util.Arrays;
import java.util.Scanner;
public class AngryCats {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long strength[]=new long[N];
		long calorie[]=new long[N];
		for(int i=0;i<N;i++)
			strength[i]=sc.nextLong();
		for(int i=0;i<N;i++)
			calorie[i]=sc.nextLong();
		Arrays.sort(strength);
		Arrays.sort(calorie);
		long res=0L;
		for(int i=0;i<N;i++) {
			res+=(strength[i]*calorie[i]);
		}
		System.out.println(res);
		sc.close();
	}
}
