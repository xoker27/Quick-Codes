import java.util.*;
class Paintings {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int Z=sc.nextInt();
            int countX=X/3;
            //System.out.println("No. of First Kind: "+countX);
            int countY=Y/3;
            //System.out.println("No. of Second Kind: "+countY);
            int countZ=Z/3;
            //System.out.println("No. of Third Kind: "+countZ);
            int remX=X%3;
            int remY=Y%3;
            int remZ=Z%3;
            //System.out.println("No. of Forth Type:"+Math.min(remX,Math.min(remY,remZ)));
            int res1=countX+countY+countZ+Math.min(remX,Math.min(remY,remZ));
            int res2=(Math.min(X, Math.min(Y, Z)));
            if(res1>res2)
            	System.out.println(res1);
            else
            	System.out.println(res2);
        }
        sc.close();
    }
}
