import java.util.Arrays;

public class reomoveElement {
    // static int[] toSwap(int nums[], int i, int j){
    //     int temp = nums[i];
    //     nums[i]= nums [j];
    //     nums[j] = temp;
    //     return nums;

    // }
    // static int[] toMove(int [] nums, int val){
    //     int i =0;
    //     int j = nums.length-1;
    //     while (i<j) {
    //         while (i<j && nums[j]== val) {
    //             j--;
    //         if(nums[i] == val){
    //             toSwap(nums, i, j);
    //         }
    //         i++;
    //         }
           
    //     }
    //     return nums;
    // }


    public static void main(String[] args) {
        reomoveElement obj  = new reomoveElement();
        int [] nums = {0,1,2,2,3,0,4,2};
        int val =2;
        int ans[]=new int[nums.length];
        

       
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val){
                continue;
            }
            else{
                while(ans.length-1==0){
                    ans[i] = nums[i];
                    System.out.println(ans[i]);
                    i--;
                }
            }
            
            
        }



        
    //   for (int j = 0; j < nums.length; j++) {
    //     System.out.println(nums[j]);
    //   }
        
       
        
    }      
}
