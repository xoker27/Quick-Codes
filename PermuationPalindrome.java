import java.util.HashMap;
import java.util.Scanner;
public class PermuationPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int flag=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!map.containsKey(c))
				map.put(c,1);
			else
				map.put(c,map.get(c)+1);
		}
		for(int i=0;i<str.length();i++) {
			Integer value=map.get(str.charAt(i));
			if(value%2!=0)
				flag++;
			if(flag>1) {
				System.out.println("NO");
				break;
			}
		}
		if(flag<2)
			System.out.println("YES");
	}
}
