import java.util.*;
public class longestCommonPrefix{
    public int minSize(String str []){ 
        int min = str[0].length();
        for(int i = 0; i <str.length; i++){
            if(str[i].length()<min){
                min = str[i].length();
            }
        }
       return min;
       
    }
    public String answer(String str[]){
        longestCommonPrefix obj1 = new longestCommonPrefix();
         int min =obj1.minSize(str);
        String result= "";
        char current;
        for (int i = 0; i < min; i++) {
            current = str[0].charAt(i);
            for (int j = 1; j < str.length; j++) {
                if (str[j].charAt(i)!=current) {
                        return result;
                }
                
            }
                result+=current;
        }
            
          return result;  
    }
    
    public static void main(String[] args) {
        longestCommonPrefix obj = new longestCommonPrefix();
        System.out.println(obj.answer(args));
        String str[] = {"flower","flow","flight"};
    }
}