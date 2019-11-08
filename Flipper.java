import java.util.Scanner;
public class Flipper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		int res;
		while(T-->0) {
			String str=sc.nextLine();
			String data[]=str.split(" ");
			str=data[0];
			res=0;
			int K=Integer.parseInt(data[1]);
			//System.out.println("Data:"+str+"\tK:"+K);
			StringBuffer buffer=new StringBuffer();
			for(int i=0;i<data[0].length();i++) {
				if(data[0].charAt(i)=='+')
					buffer.append("1");
				else
					buffer.append("0");
			}
			//System.out.println(buffer);			
			for(int i=0;i<buffer.length();i++) {
				if(buffer.charAt(i)=='0' && buffer.substring(i).length()>=K) {
					res++;
					buffer.replace(i,i+K,flipBits(new StringBuffer(buffer.substring(i,i+K)))+"");
					//System.out.println("HI"+" "+buffer);
				}
			}
			if(new String(buffer).contains("0")) {
				System.out.println("IMPOSSIBLE");
			}
			else
				System.out.println(res);
			//System.out.println(buffer);
		}
	}
	static String flipBits(StringBuffer n) {
		//System.out.println("Num is "+n);
		for(int i=0;i<n.length();i++)
			n.replace(i,i+1,(Integer.parseInt(n.charAt(i)+"")^1)+"");
		return n.toString();
	}
}