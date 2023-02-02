public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "HELLO WORLD";
        System.out.println(s);
        String ans ="";
        s = s.trim();
        System.out.println(s);
        

            for (int i = s.length()-1; i >= 0; i--) {
                if(s.charAt(i)!=' '){
                    ans+=s.charAt(i);
                    
                }
                else{
                    break;
                }
                

                
                
            }
            System.out.println(ans.length());


    }
    
}
