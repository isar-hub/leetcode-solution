public class mathSqrt {
    public static void main(String[] args) {
        int num = 4;
        int count = 0;
        int oddNum = 1;
        while(num !=0 ){
            if (num<0) {
                count--;
                break;
            }
            num-=oddNum;
            oddNum+=2;
            count++;

        }
        System.out.println(count);
    }
    
}
