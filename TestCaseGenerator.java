import java.util.ArrayList;
import java.util.Iterator;

public class TestCaseGenerator {
	public static int[] generator(){
		int arr[]=new int[100000];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		return arr;
	}
}
