import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
public class BeautifulPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		TreeMap<Character, Integer> map=new TreeMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			Integer value=map.get(str.charAt(i));
		    if(value !=null && str!="")
		    	map.put(new Character(str.charAt(i)), new Integer(value+1));
		    else
		    	map.put(new Character(str.charAt(i)), 1);
		}
		int count=0;
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()%2!=0)
				count++;
			if(count>1) {
				System.out.println("-1");
				System.exit(0);
			}
			//System.out.println(entry.getKey()+" "+entry.getValue());
		}
		for(Entry<Character, Integer> entry: map.entrySet()) {
			System.out.print(entry.getKey());
			int value=entry.getValue();
			entry.setValue(--value);
		}
	}
}
