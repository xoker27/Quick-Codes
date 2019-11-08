import java.util.Scanner;
public class FindSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String A=sc.nextLine();
			String B=sc.nextLine();
			//System.out.println("A: "+A+"\nB: "+B);
			boolean flag=false;
			for(int i=0;i<A.length();) {
				for(int j=0;j<B.length();) {
					if(A.charAt(i)==B.charAt(j)){
						j++;
						i++;
						//System.out.println(i+" "+j);
					}
					else {
						i++;
					}
					if(j==B.length()) {
						System.out.println(A.substring(0,i));
						flag=true;
						break;
					}
				}
				if(flag)
					break;
			}
		}
	}
}
