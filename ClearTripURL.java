import java.util.Scanner;
public class ClearTripURL {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1[]=sc.nextLine().split("service?");
		String str2[]=str1[1].split("&");
		for(int i=0;i<str2.length;i++) {
			if(i==0)
				System.out.println(str2[i].substring(1).replace("=",": "));
			else
				System.out.println(str2[i].replace("=",": "));
		}
	}
}
