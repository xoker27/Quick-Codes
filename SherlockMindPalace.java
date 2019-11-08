import java.util.Arrays;
import java.util.Scanner;

public class SherlockMindPalace {
	public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N,M;
        N=sc.nextInt();
        M=sc.nextInt();
        int arr[][]=new int[N][M];
        for(int i=0;i<N;i++) {
        	for(int j=0;j<M;j++) {
        		arr[i][j]=sc.nextInt();
        	}
        	Arrays.sort(arr[i]);
        }
        int testcases=sc.nextInt();
        while(testcases-->0) {
        	int find=sc.nextInt();
        	int k = 0;
    		int l = M-1; 
    		boolean flag=false;
    		while(k<N && l>=0){
    			if(arr[k][l] == find){
    		         System.out.println(k+" "+l);
    		         flag=true;
    		         break;
    		      }
    		    if(arr[k][l] > find)
    		        l--;
    		    else 
    		        k++;
    		} 
    			if(!flag)
    		   System.out.println("-1 -1");
        }
        sc.close();
    }
}
