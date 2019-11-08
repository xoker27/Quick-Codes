import java.util.Arrays;
import java.util.Scanner;
public class GoodString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0) {
			String str=sc.nextLine();
			char c;
			int index;
			int min;
			int temp;
			for(int j=0; j<str.length(); j++){
				StringBuilder testCase=new StringBuilder(str.charAt(j));
				min=testCase.length();
				if(Character.compare(testCase.charAt(0), testCase.charAt(min-1))==0){
					System.out.println(0);
					continue;
				}
				for(int i=0;i<testCase.length();i++){
					c=testCase.charAt(i);
					index=testCase.lastIndexOf(c+"");
					if(index>=0 && i!=index){
						temp=testCase.length()-index-1;
						temp+=i;
						if(temp<min)
							min=temp;
					}
				}
				if(Integer.compare(min,testCase.length())==0)
					System.out.println(-1);
				else
					System.out.println(min);
			}     
		}
	}
}
