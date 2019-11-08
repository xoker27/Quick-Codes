import java.math.BigInteger;
import java.util.*;
class DivisibleBy6 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        for(int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'a':
                    res+="1";
                    break;
                case 'b':
                    res+="2";
                    break;
                case 'c':
                    res+="3";
                    break;
                case 'd':
                    res+="4";
                    break;
                case 'e':
                    res+="5";
                    break;
                case 'f':
                    res+="6";
                    break;
            }
        }
        //System.out.println(res);
        String data=new BigInteger(res).mod(new BigInteger(String.valueOf(6)))+"";
        if(data.equals("0"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
