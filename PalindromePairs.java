import java.util.Scanner;
class PalindromePairs {
    public static void main(String ...args ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        String arr[]=new String[N];
        sc.nextLine();
        for(int i=0;i<N;i++)
            arr[i]=sc.nextLine();
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
            	StringBuffer rev=new StringBuffer(arr[j]);
            	rev=rev.reverse();
                if(arr[i].equals(rev.toString()))
                	count++;
	
            }
        }
        System.out.println(count);
    }
}
