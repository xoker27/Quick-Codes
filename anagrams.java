import java.util.*;
class anagrams {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int a=0,b=0;
        for(int i=0;i<str.length();i++) {
        	switch(str.charAt(i)) {
        	case 'U':
        		b++;
        		break;
        	case 'D':
        		b--;
        		break;
        	case 'L':
        		a--;
        		break;
        	case 'R':
        		a++;
        		break;
        	default:
        	}
        }
        System.out.print(a+" "+b);
    }
}
