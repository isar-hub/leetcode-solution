import java.util.HashSet;

public class practice {
    public static int getCommon(int nums1[], int nums2[]){
       HashSet <Integer> s = new HashSet<>();
       for (int i = 0; i < nums1.length; i++) {
        s.add(nums1[i]);
        
       }
       for (int i = 0; i < nums2.length; i++) {
        
       }
      

    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,6};
        int nums2[] = {2,4,5};
     
       
        int ans = getCommon(nums1, nums2);
        System.out.println(ans);
       
    }
}
