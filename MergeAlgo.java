import java.util.Scanner;
public class MergeAlgo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int X=sc.nextInt();
			int Y=sc.nextInt();
			int arr1[]=new int[X];
			int arr2[]=new int[Y];
			int arr3[]=new int[X+Y];
			for(int i=0;i<X;i++)
				arr1[i]=sc.nextInt();
			for(int i=0;i<Y;i++)
				arr2[i]=sc.nextInt();
			int i=0,j=0,k=0;
			while(i<X && j<Y) {
				if(arr1[i]>arr2[j]) {
					arr3[k++]=arr2[j++];
				}
				else {
					arr3[k++]=arr1[i++];
				}
			}
			while(i<X)
				arr3[k++]=arr1[i++];
			while(j<Y)
				arr3[k++]=arr2[j++];
			for(int l=0;l<X+Y;l++)
				System.out.print(arr3[l]+" ");
			System.out.println();
		}
	}
}
