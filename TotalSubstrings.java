import java.util.HashMap;
import java.util.Scanner;
public class TotalSubstrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int res=0;
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String s=str.substring(i,j);
				if(map.containsKey(s))
					continue;
				else {
					map.put(s, 1);
					res++;
				}
			}
		}
		System.out.println(res);
		sc.close();
	}
}
