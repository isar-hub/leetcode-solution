public class removeDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        for (int  i = 0; i < nums.length; i++) {
            int temp = nums[0];
             nums[0] =nums[i];
             nums[i] = temp;
             System.out.println(nums[i]);
             for (int j = 1; j < nums.length; j++) {
                if(nums[0]== nums[j]){
                    nums[nums.length-j]= nums[i];
                    
                }
                
             }


            
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    
}
