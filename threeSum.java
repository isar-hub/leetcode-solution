public class threeSum {
    public static void main(String[] args) {
        int nums []= {-1,0,1,2,-1,-4};
        int count=0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                for (int j2 = 0; j2 < args.length; j2++) {
                    if (i!=j2 && i!=j &&j!=j2 && nums[i]+nums[j]+nums[j2]==0) {
                        count++;
                        
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
