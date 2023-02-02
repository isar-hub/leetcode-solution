// Time Complexity: O(logn)
// 1. First, we initialize low and high to 0 and nums.length-1 respectively.
// 2. Then, we initialize mid to low + (high-low)/2.
// 3. If target is equal to nums[mid], then we return mid.
// 4. Else if target is greater than nums[mid], then we update low to mid+1.
// 5. Else we update high to mid-1.
// 6. We repeat steps 2 to 5 until low > high.
// 7. If we reach here, then the target is not present in nums, so we return -1.
public class binarySearch {
    public static int search(int[] nums, int target){
        int low = 0;
        int high =nums.length-1;

        while(low<=high) {
            int mid = low+high/2;

            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return hih;

    }
    public static void main(String[] args) {
        Object ob = new Object();
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ans =search(nums, target);
        System.out.println(ans);
        
    }
    
}
