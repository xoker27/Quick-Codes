import java.util.Scanner;

class MaximumIndex {
	
	public static void main (String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 int T=sc.nextInt();
    	 while(T-->0){
    	     int N=sc.nextInt();
    	     int arr[]=new int[N];
    	     int minArray[]=new int[N];
    	     int maxArray[]=new int[N];
    	     for(int i=0;i<N;i++)
    	        arr[i]=sc.nextInt();
    	     int currentMinIndex=0;
    	     int currentMaxIndex=N-1;
    	     minArray[0]=0;
    	     for(int i=1;i<N;i++){
    	         if(arr[i]<arr[currentMinIndex])
    	        	 currentMinIndex=i;
    	         minArray[i]=currentMinIndex;
    	     }
    	     maxArray[N-1]=N-1;
    	     for(int i=N-2;i>=0;i--){
    	         if(arr[i]>arr[currentMaxIndex])
    	            currentMaxIndex=i;
    	         maxArray[i]=currentMaxIndex;
    	     }
    	     for(int i=0;i<N;i++){
    	         if(maxArray[i]>minArray[i])
    	        	 System.out.println(maxArray[i]-minArray[i]);
    	     }
    	 }
	 }
}