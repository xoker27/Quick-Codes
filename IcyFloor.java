import java.util.HashMap;
import java.util.Scanner;
public class IcyFloor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int i=0, X=0, Y=0;
		String pos=X+""+Y;
		map.put(pos, 1);
		int res=0;
		while(i<str.length()) {
			if(str.charAt(i)=='R') {
				pos=(X)+""+(Y+1)+"";
				Y+=1;
			} else if(str.charAt(i)=='L') {
				pos=(X)+""+(Y-1)+"";
				Y-=1;
			} else if(str.charAt(i)=='U') {
				pos=(X-1)+""+(Y)+"";
				X-=1;
			} else if(str.charAt(i)=='D') {
				pos=(X+1)+""+(Y)+"";
				X+=1;
			}
			if(map.containsKey(pos))
				res++;
			else {
				map.put(pos, 1);
			}
			i++;
		}
		System.out.println(res);
		sc.close();
	}
}