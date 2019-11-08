import java.util.HashMap;
import java.util.Scanner;
public class RemoveDuplicateChars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch,1);
				System.out.print(ch);
			}
		}
	}
}
