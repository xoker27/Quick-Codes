import java.util.Arrays;
import java.util.Scanner;
public class NeedForModerator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String str[]=new String[N];
		sc.nextLine();
		for(int i=0;i<str.length;i++) {
			str[i]=sc.nextLine().replaceAll(":", "").replaceAll("-", " ");
		}
		/*
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		*/
		String res="";
		for(int i=0;i<str.length;i++) {
			res=res+str[i]+" ";
		}
		String finalRes[]=res.trim().split(" ");
		String oldRes[]=new String[finalRes.length];
		/*
		for(int i=0;i<finalRes.length;i++) {
			System.out.print(finalRes[i]+" ");
		}
		System.out.println();
		*/
		for(int i=0;i<finalRes.length;i++) {
			oldRes[i]=finalRes[i];
		}
		Arrays.parallelSort(finalRes);
		/*
		for(int i=0;i<finalRes.length;i++) {
			System.out.print(finalRes[i]+" ");
		}
		System.out.println();
		*/
		int i;
		for(i=0;i<finalRes.length;i++) {
			if(finalRes[i].equals(oldRes[i]))
				continue;
			else {
				System.out.println("Will need a moderator!");
				break;
			}
		}
		if(i==finalRes.length)
			System.out.println("Who needs a moderator?");
	}
}
