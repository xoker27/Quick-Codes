import java.util.*;
class PowerOfM {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long T=sc.nextLong();
        while(T-->0){
            long N=sc.nextLong();
            long M=sc.nextLong();
            long res=0;
            if (M==1)
    			res=N;
    	    else{
                while(N>0){
                    res+=N%M;
                    N/=M;
                }
    	    }
            System.out.println(res);
        }
    }
}
