import java.util.*;
public class romanToInteger{
    public void result(String s ){
      
        int ans = 0;
        for(int i = 0; i< s.length();  i++){
            int pre_value = valueOfString(s.charAt(i));
            
            if(i+1<s.length()){
                int post_value = valueOfString(s.charAt(i+1));
                if(pre_value >= post_value){
                    ans+=pre_value;
                }
                else{
                    ans=ans +post_value-pre_value;
                    i++;
                }
                
            }
            else{
                ans+=pre_value;
            }
           
        }
        System.out.println(ans);
    }
    public int valueOfString(char r){
        if(r == 'I'){
            return 1;
        }
        if(r == 'V'){
            return 5;
        }
        if (r == 'X'){
            return 10;
        }
        if(r =='L'){
            return 50;
        }
        if(r == 'C'){
            return 100;
        }
        if(r == 'D'){
            return 500;
        }
        if(r == 'M'){
            return 1000;
        }
        return -1;
    }
    public static void main(String[] args) {
         String s = "LVIII";
        romanToInteger obj = new romanToInteger();
        obj.result(s);
    }
}