import java.util.*;
class FindThePath {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String map[][]=new String[N+1][N+1];
        String str;
        sc.nextLine();
        for(int i=0;i<N;i++) {
        	str=sc.nextLine();
            String arr[]=str.split(" ");
        	for(int j=0;j<N;j++) {
        		map[i][j]=arr[j];
        	}
        }
        /*for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		System.out.print("%"+map[i][j]+"%");
        	}
        	System.out.print("\n");
        }
        */
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
        		if(map[i][j].equals("S")) {
        			//System.out.println("YEAH!");
        			calNextCoor(i, j,map,0);
        		}
        	}
        }
        
    }
    public static boolean calNextCoor(int x1,int y1,String [][]board,int res) {
    	System.out.println("AT X:"+x1+" AT Y:"+y1);
		if(board[x1][y1].equals("E")) {
			System.out.println(res);
			return true;
		}
		else if(x1>=0 && x1<=board.length && y1>=0 && y1<=board.length) {
				res++;
				if(x1!=board.length && board[x1+1][y1].equals("P") && calNextCoor(x1+1, y1, board,res)) {
					board[x1+1][y1]="X";
					return true;
				}
				else if(x1!=0 && board[x1-1][y1].equals("P") && calNextCoor(x1-1, y1, board,res)){
					board[x1-1][y1]="X";
					return true;
				}
				else if(y1!=board.length && board[x1][y1+1].equals("P") && calNextCoor(x1, y1+1, board,res)){
					board[x1][y1+1]="X";
					return true;
				}
				else if(y1!=0 && board[x1][y1-1].equals("P") && calNextCoor(x1, y1-1, board,res)){
					board[x1][y1-1]="X";
					return true;
				}
				return false;
		}
		return false;
    }
}
