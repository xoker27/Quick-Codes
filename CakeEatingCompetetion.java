import java.util.Scanner;

public class CakeEatingCompetetion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,i;
		N=sc.nextInt();
		for(i=0;i<=900;i++){
		if(N>=i*(i+1)*(i+2)/3 && N<(i+1)*(i+2)*(i+3)/3){
			if(N<=(i*(i+1)*(i+2)/3+i+1))
				System.out.println("Darshak");
			else
			System.out.println("Chandan");
		break;
		}
		}
	}
}
