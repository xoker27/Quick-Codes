import java.util.Scanner;
public class CountPossibleDecodings {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String str=sc.nextLine();
			System.out.println(countDecoding(str,str.length()));
		}
		sc.close();
	}
	public static int countDecoding(String str, int N) {
		int count[] = new int[N+1];  
	    count[0] = 1; 
	    count[1] = 1; 
	    if(str.charAt(0)=='0')
	          return 0; 
	    for (int i = 2; i <= N; i++){ 
	        count[i] = 0; 
	        if (str.charAt(i-1) > '0') 
	            count[i] = count[i - 1]; 
	        if (str.charAt(i-2) == '1' || 
	           (str.charAt(i-2)== '2' &&  
	        		   str.charAt(i-1) < '7')) 
	            count[i] += count[i - 2]; 
	    } 
	    return count[N];
	}
}
