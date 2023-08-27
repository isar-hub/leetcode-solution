import java.util.Scanner;

public class validPerfectSq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        for(int i = 1 ; i<=num; i++){
            if(i*i==num){
                System.out.println(i*i);
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        
        }
    }
    
}
