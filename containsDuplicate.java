import java.sql.Array;
import java.util.Arrays;

public class containsDuplicate {
 public static void main(String[] args) {
  
    int [] nums ={0,0,0,1,1,2};
    int max =0;
    for (int i = 0; i < nums.length-1; i++) {
       

        
        if (nums[i]==nums[i+1]) {
            max =i+1;
            int temp = nums[nums.length-1-i];
            nums[nums.length-1-i]= nums[i+1];
         
            nums[i+1] = temp;
            i++;
            
            
             
        }
      
       
  
    }
    Arrays.sort(nums,0,max);
    for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
    }
  
 
   
    
 }

    
}
