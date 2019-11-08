import java.util.Scanner;
public class RMSLusitania {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int W=sc.nextInt();
			int weight[]=new int[N+1];
			int profit[]=new int[N+1];
			int table[][]=new int[N+1][W+1];
			for(int i=1;i<=N;i++)
				weight[i]=sc.nextInt();
			for(int i=1;i<=N;i++)
				profit[i]=sc.nextInt();
			for(int i=0;i<=N;i++){
		        for(int j=0;j<=W;j++){
		                if(i==0 || j==0)
		                    table[i][j]=0;
		                else{
		                    if(j<weight[i])
		                        table[i][j]=table[i-1][j];
		                    else
		                        table[i][j]=Math.max(table[i-1][j],profit[i]+table[i-1][j-weight[i]]);
		                    }
		        }
		    }
			System.out.println(table[N][W]);
		}
	}
}
