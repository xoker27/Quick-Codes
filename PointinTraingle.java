import java.util.*;
public class PointinTraingle {
	static float area(int x1, int y1, int x2, int y2, int x3, int y3){
		   return (float) Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
		}


	static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y){   
		    float A = area (x1, y1, x2, y2, x3, y3);
		    float A1 = area (x, y, x2, y2, x3, y3);
		    float A2 = area (x1, y1, x, y, x3, y3);
		    float A3 = area (x1, y1, x2, y2, x, y);
		    return (A == A1 + A2 + A3);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T,x1,y1,x2,y2,x3,y3,x4,y4;
	    T=sc.nextInt();
	    while(T-->0){
	    	x1=sc.nextInt();
	    	y1=sc.nextInt();
	    	x2=sc.nextInt();
	    	y2=sc.nextInt();
	    	x3=sc.nextInt();
	    	y3=sc.nextInt();
	    	x4=sc.nextInt();
	    	y4=sc.nextInt();
	        if (isInside(x1,y1,x2,y2,x3,y3,x4,y4))
	         System.out.println("INSIDE\n");
	       else
	         System.out.println("OUTSIDE\n");
	    }
	}
}
