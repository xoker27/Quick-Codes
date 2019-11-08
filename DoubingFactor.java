import java.util.Scanner;
public class DoubingFactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			double B=sc.nextInt();
			double arr[]=new double[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextDouble();
				if(arr[i]==B)
					B*=2;
			}
			System.out.println(String.format("%.0f", B));
		}
	}

}
