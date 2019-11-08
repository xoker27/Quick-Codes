import java.util.Scanner;
public class MinimumInsertionPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int insert=0;
		while(!isPalindrome(str)) {
			str=str.substring(1);
			insert++;
		}
		System.out.println(insert);
		sc.close();
	}
	public static boolean isPalindrome(String str) {
		StringBuffer sBuf=new StringBuffer(str);
		return (sBuf.reverse().toString().equals(str));
	}
}
