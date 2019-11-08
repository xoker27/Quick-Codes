import java.util.Scanner;
public class CardGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr1[]=new int[N];
		for(int i=0;i<N;i++)
			arr1[i]=sc.nextInt();
		int M=sc.nextInt();
		int arr2[]=new int[M];
		int max=0;
		for(int i=0;i<M;i++) {
			arr2[i]=sc.nextInt();
			if(arr2[i]>max)
				max=arr2[i];
		}
		//System.out.println("Max is: "+max);
		int cost=0;
		for(int i=0;i<N;i++) {
			if(arr1[i]>max)
				continue;
			else {
				cost+=(max-arr1[i])+1;
				//System.out.println("Cost is: "+cost);
			}
		}
		System.out.println(cost);
		sc.close();
	}
}
