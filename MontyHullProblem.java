/*Probability of winning*/
import java.util.Scanner;
class MontyHullProblem{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        double N;
        while(T-->0){
            N=s.nextDouble();
            double res=1-(1/N);
            System.out.println(res);
            System.out.printf("%.6f",res);
        }
    }
}

