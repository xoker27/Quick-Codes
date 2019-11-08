import java.util.Scanner;
class CoolVeryCool {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
        	int res=0;
            int R=sc.nextInt();
            int K=sc.nextInt();
            for(int i=1;i<=R;i++){
                int n=i;
                String x="";
                int a=0;
                while(n > 0){
                    a = n % 2;
                    x = a + "" + x;
                    n = n / 2;
                }
                //System.out.println("For Number:"+x+" of length: "+x.length());
                int count=0;
                if(x.length()>=3) {
                	int k=0;
                	while(k<=x.length()-3) {
                		if(x.substring(k,k+3).equals("101"))
                			count++;
                		k+=1;
                	}
                }
                //System.out.println("Count is: "+count);
                if(count>=K)
            		res++;
            }
            System.out.println(res);
        }
    }
}
