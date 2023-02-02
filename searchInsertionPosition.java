public class searchInsertionPosition {
    public static void main(String[] args) {
        int nums [] ={1,3,5,6};
        int target = 7;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                count =i;
            }
            else if(nums[i]<target ){
                count = i+1;
            }
            
        }
        System.out.println(count);
    }
    
}
