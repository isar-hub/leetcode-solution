import java.util.Scanner;

public class luckyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x =3;
        int y =0;
        while(x!=0){
            if((a+b)%2==0 && (a+b)>0){
                y++;
            }
            else if((b+c)%2==0 && (b+c)>0){
                y++;
            }
            else if((a+c)%2 == 0 && (a+c)>0){
                y++;
         
            }
            x--;
        }
        if(y>0){
            System.out.println("YES");

        }
        else{
            System.out.println("NO");
        }
    }
    
}
