import java.util.Scanner;

public class SubStringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(str.substring(i,j+1).equals(new String(new StringBuffer(str.substring(i,j+1)).reverse())))
				count++;
			}
		}
		System.out.println(count);
	}
}
