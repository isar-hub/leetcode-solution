public class pivot_Index {
    public static void main(String[] args) {
        int []nums = {2,1,-1};
        int leftSum = 0;
        int rightSum = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            leftSum =0;
            rightSum=0;

            
            if(i > 0){
                for (int j = i-1; j >=0; j--) {
                    leftSum+=nums[j];
                   
                }
            }
            else{
                leftSum =0;
            }
            
            for (int j = i+1; j < nums.length; j++) {
                rightSum+=nums[j];
               
                
            }
           if (leftSum== rightSum) {
            index = i;
            break;
            
           }
        }
        if (index!=-1) {
            System.out.println(index);
            
        }
        else{
            System.out.println(-1);
        }
        
    }
    
}
