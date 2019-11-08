import java.util.Scanner;
import java.util.Stack;
public class StockSpanProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		//print(span(arr));
		print(spanImproved(arr));
	}
	
	public static int[] span(int []arr){
		int span[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			span[i]++;
			for(int j=i-1;j>0;j--) {
				if(arr[i]>arr[j])
					span[i]++;
			}
		}
		return span;
	}
	
	public static int[] spanImproved(int []arr) {
		int span[]=new int[arr.length];
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(0);
		span[0]=1;
		for(int i=1;i<arr.length;i++) {
			while(!stack.empty() && arr[stack.peek()]<=arr[i])
				stack.pop();
			span[i]=(stack.empty())?(i+1):(i-stack.peek());
			stack.push(i);
		}
		return span;
	}
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
