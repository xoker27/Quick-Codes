import java.util.Scanner;
public class DeshBaadMehColorHogaPaheleColonyKarwao {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int arr[][]=new int[N][3];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i = 1; i< N;i++){
				arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + arr[i][0];
				arr[i][1] = Math.min(arr[i-1][0],arr[i-1][2]) + arr[i][1];
		        arr[i][2] = Math.min(arr[i-1][0],arr[i-1][1]) + arr[i][2];
			}
			System.out.println(Math.min(arr[N-1][0], Math.min(arr[N-1][1],
					arr[N-1][2])));
		}
	}
}
