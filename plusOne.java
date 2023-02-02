import java.util.Arrays;
import java.util.HashSet;

public class plusOne {
    public static void main(String[] args) {
        int [] digits = {9};
        HashSet <Integer> s = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            s.add(digits[i]);
        }
        int ans[];
        if(s.contains(9)&&s.size()==1){
            ans = new int[digits.length+1];

            
        }
        else{
            ans = new int[digits.length];
        }


        
    
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]==9){
                digits[i]=0;

            }
            else{
                digits[i]++;
                break;
            }
            
        }
        if(ans.length>digits.length){
            for (int i = 0; i < digits.length; i++) {
                ans[0]=1;

                ans[i+1]= digits[i];

                
            }
        }
        else
        {
         for (int i = 0; i < ans.length; i++) {
        
            ans[i]=digits[i];
    
          }   
        }
    for (int i = 0; i < ans.length; i++) {
        System.out.println(ans[i]);
    }
}
}
