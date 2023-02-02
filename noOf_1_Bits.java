public class noOf_1_Bits {
    public static void main(String[] args) {
        int n =00000000000000000000000000001011;
        String a = Integer.toBinaryString(n);
        int count =0;
        for (int i = 0; i < a.length(); i++) {
                      
            if(a.charAt(i)=='1'){
                System.out.println(a);
                count++;
            }
        }
        System.out.println(count);

    }
    
}
