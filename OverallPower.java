import java.util.Arrays;
import java.util.Scanner;
class OverallPower {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            double arr[]=new double[N];
            double max=0;
            for(int i=0;i<N;i++){
                arr[i]=sc.nextDouble();
                if(arr[i]>max)
                    max=arr[i];
            }
            double res=0;
            for(int i=0;i<N;i++){
                for(int j =i+1;j<N;j++){
                    res+=(Math.abs(arr[i]-arr[j])%1000000007);
                }
            }
            System.out.printf("%.0f",res*max);
        }
    }
}
