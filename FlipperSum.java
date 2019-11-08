import java.util.Scanner;

class FlipperSum {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int res=flipper(num1)+flipper(num2);
            System.out.println(flipper(res));
        }
    }
    public static int flipper(int num){
        StringBuffer str=new StringBuffer(num+"");
        str=str.reverse();
        //System.out.println(str);
        return Integer.parseInt(String.valueOf(str));
    }
}
