import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class singleNumber {
    public static int SingleNumber(int nums[]){
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < nums.length-2; i++) {
           
            s.push(nums[i]);
         
            if (s.peek()== nums[i+1]) {
                s.pop();
                i++;
            }
          
            
        }
        if(s.isEmpty()){
            return nums[nums.length-1];
        }
        else{
        return s.peek();
        }


    }
    public static void main(String[] args) {
        int nums[]= {4,1,2,1,2};
        Arrays.sort(nums);
      
        
        int ans = SingleNumber(nums);
        System.out.println(ans);
        
        
       
        
           
    }
    
}
