import java.util.Scanner;
public class ChatBox {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int pCount=0,nCount=0,res=0;
		sc.nextLine();
		while(N-->0) {
			String str=sc.nextLine();
			switch(str.substring(0,2)) {
				case "G:":
					if(str.contains("19"))
						pCount+=2;
					if(str.contains("21"))
						nCount+=2;
					break;
				case "M:":
					if(str.contains("19"))
						pCount+=1;
					if(str.contains("21"))
						nCount+=1;
					break;
			}	
			//System.out.println("Positive Count: "+pCount+" Negative Count: "+nCount);
		}
		if(pCount>nCount)
			System.out.println("Date");
		else
			System.out.println("No Date");
		//System.out.println("Positive Count: "+pCount+" Negative Count: "+nCount);
	}
}


/*
import java.util.Scanner;
import java.util.StringTokenizer;
 
class GB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count19=0;
        int count20=0;
        int countOther=0;
        while(N-->0){
            String s = sc.nextLine();
            String message[] = s.split("\\s");
            if(message[0].equals("G:")){
                for(String ce:message){
                    if(ce.matches(".*\\d+.*")){
                       int date = Integer.parseInt(ce);
                       if(date==19){
                           count19+=2;
                       }
                       else if(date==20){
                           count20+=2;
                       }
                       else{
                           countOther+=2;
                       }
                    }
                }
            }
            else if(message[0].equals("M:")){
                for(String ce:message){
                    if(ce.matches(".*\\d+.*")){
                       int date = Integer.parseInt(ce);
                       if(date==19){
                           count19++;
                       }
                       else if(date==20){
                           count20++;
                       }
                       else{
                           countOther++;
                       }
                    }
                }
            }
        }
        if(count19>countOther||count20>countOther){
            System.out.println("Date");
        }
        else{
            System.out.println("No Date");
        }
    }
 */