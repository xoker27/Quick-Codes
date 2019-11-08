import java.util.Scanner;

public class LastIndexOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String str=sc.nextLine();
			System.out.println(str.lastIndexOf('1'));
		}
	}

}
