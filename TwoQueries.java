import java.util.Arrays;
import java.util.Scanner;
public class TwoQueries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		int M=sc.nextInt();
		//print(arr);
		while(M-->0) {
			int T=sc.nextInt();
			if(T==1) {
				int A,B;
				A=sc.nextInt();
				B=sc.nextInt();
				arr[A-1]=B;
				//print(arr);
			}
			if(T==2) {
				int X,Y,P;
				X=sc.nextInt();
				Y=sc.nextInt();
				P=sc.nextInt();
				int min=1000000001;
				for(int i=X-1;i<Y-1;i++) {
					if(arr[i]>P) {
						int temp=arr[i]-P;
						if(temp<min)
							min=temp;
					}
				}
				//System.out.println(min);
				int check=0;
				for(int i=0;i<arr.length;i++) {
					if(min+P==arr[i]) {
						System.out.println(arr[i]);
						check++;
						break;
					}
				}
				if(check==0)
					System.out.println("-1");
				//print(arr);
			}
		}
	}
	public static void print(int arr[]) {
		for(int i : arr)
			System.out.print(i+" ");
		System.out.print("\n");
	}
}
