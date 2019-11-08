import java.util.Arrays;
import java.util.Scanner;

public class ToyStackArrangement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
    		while(T-->0){
        		int N=sc.nextInt();
        		int P=sc.nextInt();
        		int L=sc.nextInt();
        		int arr1[]=new int[N];
        		int arr2[]=new int[N];
        		for(int i=0;i<N;i++) {
        			arr1[i]=sc.nextInt();
        			arr2[i]=sc.nextInt();
        		}
        		Arrays.sort(arr1);
        		Arrays.sort(arr2);
        		int res=0;
        		for(int i=0;i<N;i++) {
        			res+=arr1[i]-arr2[i]>0?(arr1[i]-arr2[i])*L:(arr2[i]-arr1[i])*P;
        		}
    		System.out.println(res);
		}
	}
}
