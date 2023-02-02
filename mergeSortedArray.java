import java.util.Arrays;

public class mergeSortedArray {
        public static void main(String[] args) {
            int []nums1 = {1,2,3,0,0,0};
            int m = 3;
            int nums2[] ={2,5,6};
            int n = 3;
            int ans[] = new int[m+n];
            
                for(int j = 0 ; j <m ;j++) {   
               
                    ans[j]= nums1[j];
                    
                }
             
                for (int j = 0; j < n; j++) {
                    ans[m]= nums2[j];
                    m++;
                }
                Arrays.sort(ans);
            
            for (int i = 0; i < ans.length; i++) {
                System.out.println(ans[i]);
            }
        }
}
