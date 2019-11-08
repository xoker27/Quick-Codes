import java.util.Scanner;
public class NumbersInAString {
	public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0) {
        	sc.nextInt();
            sc.nextLine();
        	String str=sc.nextLine();
        	str = str.replaceAll("[^0-9]+", " ");
        	String[] arr= str.trim().split(" ");System.out.println(arr.length);
        }
    }
}
