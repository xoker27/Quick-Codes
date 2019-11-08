import java.util.Scanner;
public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			boolean flag=false;
			int count[]=new int[1000001];
			int X=(int)(Math.ceil(N/2));
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
				count[arr[i]]++;
				if(count[arr[i]]>X) {
					System.out.println(arr[i]);
					flag=true;
					break;
				}
			}
			if(!flag)
				System.out.println("-1");
		}
	}
}
