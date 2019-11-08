import java.util.Arrays;
import java.util.Scanner;
public class MockandFriends {
	public static void gifts(int arr[],int k) {
		int flag=0,res=0;
		System.out.println("ZCscZ");
		while(flag<=k) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>=0) {
					res++;
					arr[i]--;
					System.out.println(">>>"+arr[i]);
					System.out.println("Gift Given>> "+res);
				}
				if(arr[i]<0)
					flag++;
				if(flag==k)
					break;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {5,77,2};
		int k=2;
		gifts(arr,k);
	}
}
