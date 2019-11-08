import java.util.Scanner;
public class Road {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int arr[]=new int[N];
		int table[][]=new int[N][N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {
				int data=Math.abs(arr[i]-arr[j]);
				if(data==0 || j==0)
					table[i][j]=Integer.MAX_VALUE;
				else
					table[i][j]=data;
			}
		}
		
		sc.close();
	}
}
