public class sqrt_x {
    public static void main(String[] args) {
        int x = 16;
        int count =0;
        for (int i = 1; i < Integer.MAX_VALUE; i=i+2) {
            x -=i;
            count++;
            if (x==0) {
                break;
                
            }
            else if(x<0){
                count--;
                break;
            }
            
        }
        System.out.println(count);
    }
    
    
}
