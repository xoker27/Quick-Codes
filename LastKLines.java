import java.util.Scanner;
import java.io.*;
public class LastKLines {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter file name with path: ");
		String fileName=sc.nextLine();
		File f=new File(fileName);
		if(!f.exists()) {
			System.out.println("No such file Found!");
			System.exit(0);
		}
		System.out.println("Enter Last \'K\' files to display: ");
		int K=sc.nextInt();
		String arr[]=new String[K];
		int i=0;
		int pos=0;
		try(BufferedReader br = new BufferedReader(new FileReader(f))) {
		    for(String line; (line = br.readLine()) != null; ) {
		    	pos=i++%K;
		        arr[pos]=line;
		    }
		}
		for(int count=0;count++<K;) {
			System.out.println(arr[pos--]);
			if(pos<0)
				pos=arr.length-1;
		}
	}
}
