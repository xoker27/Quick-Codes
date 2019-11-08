import java.util.Scanner;
import java.util.TreeMap;

public class SpecialSubstrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		TreeMap<Character,Integer> map=new TreeMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
		Integer value=map.get(str.charAt(i));
	    if(value !=null)
	    	map.put(new Character(str.charAt(i)), new Integer(value+1));
	    else
	    	map.put(new Character(str.charAt(i)), 1);
		}
	}
}
