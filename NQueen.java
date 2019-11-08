import java.util.Scanner;
public class NQueen { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[][]=new int[N][N];
		if(findSolution(arr,N))
			System.out.println("YES");
		else 
			System.out.println("NO");
		print(arr);
		sc.close();
	}
	public static boolean isAttacked(int N,int arr[][],int x, int y) {
		for(int i=0;i<arr.length;i++) {
			if(arr[x][i]==1)
				return true;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i][y]==1)
				return true;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i+j)==(x+y) && arr[i][j]==1)
					return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i-j)==(x-y) && arr[i][j]==1)
					return true;
			}
		}
		return false;
	}
	public static boolean findSolution(int arr[][],int N) {
		if(N==0)
			return true;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(isAttacked(N, arr,i,j))
					continue;
				arr[i][j]=1;
				if(findSolution(arr, N-1))
					return true;
				arr[i][j]=0;
			}
		}
		return false;
	}
	public static void print(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
