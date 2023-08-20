import java.util.*;
public class Palindromenumber {
    public static  boolean palindrome(int x ){
        String s = Integer.toString(x);
        String m = "";
        for ( int i = s.length()-1;i>=0;i--){
             m = m+s.charAt(i);
        
        }
        if(m.equals(s)){
        return true;
        } else{
            return false;
        }

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

       System.out.println(palindrome(x));
        
    }
}
