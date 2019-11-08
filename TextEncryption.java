import java.util.Scanner;

public class TextEncryption {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T,temp;
		String s;
		T=sc.nextInt();
		sc.nextLine();
		while(T-->0){
		int prev=0,next=0;
		s=sc.nextLine();
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			temp=next;
			next=(arr[i]-'a');
			prev=temp;
			if(next-prev <= -13) 
				System.out.print(next-prev+26+" ");
			else if(next-prev > 13) 
				System.out.print(next-prev-26+" ");
			else 
				System.out.print(next-prev+" ");
		}
		System.out.println();
		}
	}
}
