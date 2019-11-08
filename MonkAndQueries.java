import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class MonkAndQueries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Q=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ListIterator<Integer> iter=arr.listIterator();
		while(Q-->0) {
			int N=sc.nextInt();
			switch(N) {
			case 1:
				arr.add(sc.nextInt());
				break;
			case 2:
				int y=sc.nextInt();
				if(arr.contains(y)) {
					for(int i=0;i<arr.size();i++) {
						if(arr.get(i).equals(y))
							arr.remove(i);
					}
				}
				else
					System.out.println("-1");
				break;
			case 3:
				int max=-1;
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i)>max)
						max=arr.get(i);
				}
				System.out.println(max);
				break;
			case 4:
				int min=100001;
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i)<min)
						min=arr.get(i);
				}
				if(arr.isEmpty())
					System.out.println("-1");
				else
					System.out.println(min);
				break;
			}
			/*
			for(int i=0;i<arr.size();i++) {
				System.out.print(arr.get(i)+" ");
			}
			System.out.println();
			*/
		}
	}
}
