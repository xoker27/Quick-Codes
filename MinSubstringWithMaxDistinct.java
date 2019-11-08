import java.util.HashMap;
import java.util.Scanner;
public class MinSubstringWithMaxDistinct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String str=sc.nextLine();
			HashMap<Character, Integer> map=new HashMap<Character, Integer>();
			int finalCount=0,count=0;
			for(int i=0;i<str.length();i++) {
				if(!map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), 1);
					count++;
				}
				else {
					count=0;
					map.clear();
				}
				if(count>finalCount) {
					finalCount=count;
				}
			}
			System.out.println(map.size());
		}
		sc.close();
	}
}
