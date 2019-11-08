import java.util.Scanner;
public class CommanOfThreeArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N1=sc.nextInt();
			int N2=sc.nextInt();
			int N3=sc.nextInt();
			int arr1[]=new int[N1];
			int arr2[]=new int[N2];
			int arr3[]=new int[N3];
			for(int i=0;i<N1;i++)
				arr1[i]=sc.nextInt();
			for(int i=0;i<N2;i++)
				arr2[i]=sc.nextInt();
			for(int i=0;i<N3;i++)
				arr3[i]=sc.nextInt();
			for(int i=0,j=0,k=0;i<N1 && j<N2 && k<N3;) {
				if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) {
					System.out.print(arr1[i]+" ");
					i++;
					j++;
					k++;
				}
				else if(arr1[i]<arr2[j])
					i++;
				else if(arr2[j]<arr3[k])
					j++;
				else
					k++;
			}
			System.out.println();
		}
	}

}
