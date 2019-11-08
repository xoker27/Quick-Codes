import java.util.Scanner;
public class BeatPair {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int boys[]= new int[5];
		int girls[]= new int[5];
		for(int i=1;i<boys.length;i++)
			boys[i]=sc.nextInt();
		for(int i=1;i<girls.length;i++)
			girls[i]=sc.nextInt();
		int boysCount=0;
		int girlsCount=0;
		for(int i=1;i<boys.length;i++) {
			if(girls[boys[i]]!=i)
				boysCount++;
		}
		for(int i=1;i<girls.length;i++) {
			if(boys[girls[i]]!=i)
				girlsCount++;
		}
		System.out.println(Math.max(boysCount,girlsCount)+" "+girlsCount);
	}
}
