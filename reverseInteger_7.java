public class reverseInteger_7 {
    public static void main(String[] args) {
        int x =1534236469;
        long reverse=0;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        while(x!=0){
        
        
            long remain = x%10;
            reverse = reverse*10+remain;
            x/=10;
        }
        System.out.println(reverse);
        if (reverse > Integer.MAX_VALUE) {
            System.out.prin    tln(0);
            
        }
        else{System.out.println(1);}
    }
    
}
