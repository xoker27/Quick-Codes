import java.util.Scanner;
public class IndexValueSame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			boolean flag=false;
			int arr[]=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
				if(i+1 == arr[i]) {
					flag=true;
					System.out.print(arr[i]+" ");
				}
			}
			if(!flag)
				System.out.println("Not Found");
			System.out.println();
		}
	}

}
