public class validPalindrome {
    public static void main(String[] args) {
        String s ="ab_a   hcakj";
        s = s.toLowerCase();
        String a ="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>96 && s.charAt(i)<123|| s.charAt(i)>47 && s.charAt(i)<58) {
                a+=s.charAt(i);
            
            }
        }
        System.out.println(a);
        String b = "";
        for (int i =a.length()-1 ; i >=0; i--) {

            b+=a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("true");
        }
        else{System.out.println("false");}
    }
}
