/*
 HackerEarth Problem:
 T is no. of test cases
 N are the no.'s in each test case
 arr[] stores those numbers
 and finally we calculate N'th root of product of those numbers.
 ***Divide and Conquer***
*/
import java.util.*;
class NRoot {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T;
        double N,res;
        T=s.nextInt();
        while(T-->0){
            N=s.nextDouble();
            res=1;
            double arr[]=new double[(int)N];
            for(int i=0;i<(int)N;i++) {
            	arr[i]=s.nextDouble();
            	arr[i]=Math.pow(arr[i],1/N);
            	res*=arr[i];
            }
            System.out.printf("%.4f\n",res);
        }
        s.close();
    }
}