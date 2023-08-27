
public class mergeSortedList{
    public int[] mergeSort(int arr[],int p, int r){
        int q = (p+r)/2;
        mergeSort(arr, p, r);
        mergeSort(arr, p+1, r);
        mergeSort(arr, q, r);
        return arr;

    }
    public static void main(String[] args) {
        int [] arr = { 0,5,8,3,7,9,0};
        mergeSortedList myCLass = new mergeSortedList();
        int []ans = myCLass.mergeSort(arr, 0,0);
        for (int i : ans) {
            System.out.print(ans[i]);
        }
    }
}