import java.util.Scanner;   
class CompresssString { 
      static String removeUtil(String str, char last_removed) { 
             if (str.length() == 0 || str.length() == 1) 
                 return str; 
             if (str.charAt(0) == str.charAt(1)){ 
                 last_removed = str.charAt(0); 
                 while (str.length() > 1 && str.charAt(0) == str.charAt(1)) 
                       str = str.substring(1, str.length()); 
                 str = str.substring(1, str.length()); 
                 return removeUtil(str, last_removed);  
             } 
             String rem_str = removeUtil(str.substring(1,str.length()), last_removed); 
             if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)){ 
                last_removed = str.charAt(0);
                return rem_str.substring(1,rem_str.length());
             }
             if (rem_str.length() == 0 && last_removed == str.charAt(0)) 
                 return rem_str; 
             return (str.charAt(0) + rem_str); 
      } 
      
      public static void main(String args[]){ 
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            System.out.println(removeUtil(str,'\0'));
            sc.close();
      } 
} 