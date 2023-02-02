import java.util.HashSet;

public class townJudge {
    public static void main(String[] args) {
        int n = 2;
        int trust[][]={{1,2}};
        int trusts [] = new int[n+1];
        int trusted_by[] = new int [n+1];
        for (int i = 0; i < trust.length; i++) {
            for (int j = 0; j < trust[i].length; j++) {
                if(j==0){
                    trusts[trust[i][j]]++;
                }
                else{
                trusted_by[trust[i][j]]++;
                }
                
            }
            
        }
        for (int i = 1; i < n+1; i++) {
           if (trusts[i]==0 && trusted_by[i]==n-1) {
            System.out.println(i);
            
           }
           else{
            continue;
           }
        }

    }

    
}
