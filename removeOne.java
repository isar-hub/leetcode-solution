import java.util.Scanner;

public class removeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int l = sc.nextInt();
            long s = sc.nextLong();

            int ans[] = new int[n];
            for (int i = 0; i < ans.length; i++) {
                ans[i]= i+1;
            }
            int x = 0;
            int y = l+1;
            int z =0;
            for (int i = x; i <y; i++) {
                z+=ans[i];
                if(z>s){
                    if(z-ans[i]==s){
                        System.out.println("Yes");
                        break;
                    }
                    else{
                        x++;
                        y++;
                    }
                }
                
            }
            System.out.println("ncl.");
        }
    }
    
}
