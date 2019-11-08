import java.util.Scanner;
public class BhadwaMonkOrUskiQueries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int arr[]=new int[N+1];
		for(int i=1;i<=N;i++) {
			arr[i]=sc.nextInt();
		}
		while(M-->0) {
			boolean flag=false;
			int X=sc.nextInt();
			switch(X) {
			case 0:
				int a=sc.nextInt();
				int b=sc.nextInt();
				arr[a]=b;
				break;
			case 1:
				int c=sc.nextInt();
				for(int i=1;i<N+1;i++) {
					if(arr[i]>=c) {
						flag=true;
						System.out.println(i);
						break;
					}
				}
				if(!flag)
					System.out.println("-1");
				break;
			default:
				System.out.println("Ajib Admi hai!");
			}
			/*for(int i=1;i<N+1;i++)
				System.out.print(arr[i]+" ");*/
		}
	}
}
