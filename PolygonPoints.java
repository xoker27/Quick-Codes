import java.util.Scanner;
public class PolygonPoints {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int arr[][]=new int[T][2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print(arr[i][j]+" ");
				
			}
			//System.out.println();
		}
	}
}
