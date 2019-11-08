import java.util.Scanner;
public class Mario {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N,M,X1,Y1,X2,Y2;
			N=sc.nextInt();
			M=sc.nextInt();
			X1=sc.nextInt();
			Y1=sc.nextInt();
			X2=sc.nextInt();
			Y2=sc.nextInt();
			int board[][]=new int[N+1][M+1];
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=M;j++) {
					board[i][j]=sc.nextInt();
				}
			}
			if(calNextCoor(X1, Y1, X2, Y2, N, M, board))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
	public static boolean calNextCoor(int x1,int y1,int x2,int y2,int N,int M,int [][]board) {
		if(x1==x2 && y1==y2)
			return true;
		else if(x1>=1 && x1<=N && y1>=1 && y2<=M) {
				if(x1!=N && board[x1+1][y1]>board[x1][y1] && calNextCoor(x1+1, y1, x2, y2, N, M, board))
					return true;
				else if(x1!=1 && board[x1-1][y1]>board[x1][y1] && calNextCoor(x1-1, y1, x2, y2, N, M, board))
					return true;
				else if(y1!=M && board[x1][y1+1]>board[x1][y1] && calNextCoor(x1, y1+1, x2, y2, N, M, board))
					return true;
				else if(y1!=1 && board[x1][y1-1]>board[x1][y1] && calNextCoor(x1, y1-1, x2, y2, N, M, board))
					return true;
				return false;
		}
		return false;
	}
}
