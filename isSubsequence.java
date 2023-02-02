public class isSubsequence{
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                if (curr == t.charAt(j)) {
                    a+=t.charAt(j);
                    
                }
                
            }
        }
        if(a == s){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}