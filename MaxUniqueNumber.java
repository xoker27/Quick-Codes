import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class MaxUniqueNumber {
	public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map;
        int T;
        T=sc.nextInt();
        int arr[]=new int[T];
		map=new HashMap<Integer,Integer>();
        for(int i=0;i<T;i++){
        	arr[i]=sc.nextInt();
        	Integer value=map.get(arr[i]);
		    if(value !=null && arr[i]!=0)
		    	map.put(new Integer(arr[i]), new Integer(value+1));
		    else
		    	map.put(new Integer(arr[i]), 1);
		}
        Iterator it = map.entrySet().iterator();
        int temp,max=0;
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(Integer.parseInt(pair.getValue().toString())==1) {
            	temp=Integer.parseInt(pair.getKey().toString());
            	if(max<temp)
            	    max=temp;
            }
            it.remove(); 
        }
        if(max==0)
            System.out.println("-1");
        else
            System.out.println(max);
        sc.close();
    }
}
