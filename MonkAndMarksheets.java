import java.util.*;
public class MonkAndMarksheets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		List<String> names;
	    Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
	    sc.nextLine();
	    for(int i=0;i<N;i++){	    	
	        String str[]=sc.nextLine().split(" ");
	        names=map.get(Integer.parseInt(str[1]));
        	if(names==null)
        		map.put(Integer.parseInt(str[1]),names=new ArrayList<String>() );
        	names.add(str[0]);
	    }
		List<Integer> marks=new ArrayList<Integer>(map.keySet());
	    Collections.sort(marks);
	    Collections.reverse(marks);
   	    for(int sort:marks){
   	    	names=map.get(sort);
		   	Collections.sort(names);
		   	for(String name:names)
		   		System.out.println(name+" "+sort);
   	    }
	   sc.close();
	}
}