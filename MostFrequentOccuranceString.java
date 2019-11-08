import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MostFrequentOccuranceString {
	public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map;
        String str;
        int T;
        T=sc.nextInt();
        sc.nextLine();
		map=new HashMap<String,Integer>();
        for(int i=0;i<T;i++){
        	str=sc.nextLine();
        	Integer value=map.get(str);
		    if(value !=null && str!="")
		    	map.put(new String(str), new Integer(value+1));
		    else
		    	map.put(new String(str), 1);
		}
        /*To print in accending order in case of same frequency*/
        Collection c = map.values();
		Integer max = (int)Collections.max(c);
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
	    	if(entry.getValue().intValue() == max.intValue()){
	      		System.out.println(entry.getKey());
	      		break;
	    	}
		}
        sc.close();
    }
}
