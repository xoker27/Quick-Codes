import java.util.Scanner;
public class PeetDoo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int N=sc.nextInt();
		int boys[]=new int[N];
		int girls[]=new int[N];
		int flag1[]=new int[N];
		int flag2[]=new int[N];
		for(int i=0;i<N;i++)
		    boys[i]=sc.nextInt()-1;
		for(int i=0;i<N;i++)
		    girls[i]=sc.nextInt()-1;
		for(int i=0;i<N;i++){
		    if(i!=girls[boys[i]])
		        flag1[girls[boys[i]]]++;
		}
		for(int i=0;i<N;i++){
		    if(i!=boys[girls[i]])
		        flag2[boys[girls[i]]]++;
		}
		
		for(int i=0;i<N;i++)
			System.out.print(flag1[i]);
		System.out.println();
		for(int i=0;i<N;i++)
			System.out.print(flag2[i]);
		
	}
}
