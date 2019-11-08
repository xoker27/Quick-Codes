import java.util.HashMap;
import java.util.Scanner;
public class GoodAverageBad {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int distinct=sc.nextInt();
			HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<N;i++) {
				int num=sc.nextInt();
				Integer value=map.get(new Integer(num));
		       	if(value!=null && value>0)
		    		map.put(new Integer(num), new Integer(value+1));
		       	else
		       		map.put(new Integer(num), 1);
			}
			int distinctCount=map.size();
			if(distinctCount==distinct)
				System.out.println("Good");
			else if(distinctCount>distinct)
				System.out.println("Average");
			else if(distinctCount<distinct)
				System.out.println("Bad");
			map.clear();
		}
	}
}
