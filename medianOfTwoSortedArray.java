public class medianOfTwoSortedArray {
    
    public static void main(String[] args) {
        int nums1[] = {3,2};
        int nums2[] = {1};
        int arr[] = new int[nums1.length+nums2.length];
        for(int i =0; i<nums1.length ; i++){
            arr[i] = nums1[i];

        }
        for(int i = nums2.length-1; i<nums2.length; i++){
            arr[i] = nums2[i];
        }
        for(int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
