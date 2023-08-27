public class happyNumber {
    public int isHappyNumber(int ans){
        int count =0;
        int a =0;
        while (ans>0) {
             
                count = ans%10;
                a+= Math.pow(count, 2);
                ans =ans/10;
            
        }
        return a;
    }
    public static void main(String[] args) {
        int n  = 19;
        int ans = n;
        boolean a = false;

      
        happyNumber m = new happyNumber();
        while(ans!=1 ){
                ans =m.isHappyNumber(ans);
                if(ans ==1){
                    a = true;
                }
                
        
              
        }
        System.out.println(a);
       
        
    }
    
}
