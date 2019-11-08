import java.util.Scanner;
import java.util.TreeMap;
public class Pokemon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		String str="";
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			map.put(arr[i],1);
		    str+=arr[i];
		}
		int count=0;
		TreeMap<Character,Integer> map2=new TreeMap<Character,Integer>();
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<=N;j++) {
				String temp=str.substring(i, j);
				for(int k=0;k<temp.length();k++) {
					map2.put(temp.charAt(k),1);
				}
				if(map.size()==map2.size())
					count++;
				map2.clear();
				//System.out.println(temp+" "+map2.size());
			}
		}
		System.out.println(count);
		sc.close();
	}
}
