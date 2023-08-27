import java.util.*;
public class reomoveDuplicateFromLL {



  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode ans = new removeDuplicate().ListNode();
        while(head.next!=null){
            if(head.val !=ans.val){
                ans.val = head.val;
            }
        }
        return ans;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        ListNode dummyHead = new removeDuplicate().ListNode();
        ListNode current = dummyHead;
        
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            current.next = new removeDuplicate().ListNode();
            current = current.next;
        }
        
        ListNode inputList = dummyHead.next; // Start from the actual list
        sc.close();
        
        ListNode result = deleteDuplicates(inputList);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
}
