import java.util.Scanner;
class HappyMother {
    public static void main(String args[] ) throws Exception {
    	Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<N;i++)
            	arr[i]=sc.nextInt();
            long ans1=Integer.MAX_VALUE;
            long ans2=0;
            for(int i=0;i<N;i++){
                int tmp=arr[i];
                ans1=Math.min(ans1,tmp-1);
                ans2+=tmp-1;
            }
            System.out.println(ans1+" "+ans2);
        }
        sc.close();
    }
}