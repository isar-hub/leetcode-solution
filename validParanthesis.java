import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class validParanthesis {

//    by using stack
static boolean isOpening(char a){
    if(a =='('){
        return true;
    }
    if(a== '{'){
        return true;
    }
    if(a == '['){
        return true;
    }
    return false;
}

static boolean isMatching(char a , char b){
    if(a == '(' && b ==')'){
        return true;
    }
    if(a== '{' && b == '}'){
        return true;
    }
    if(a == '[' && b == ']'){
        return true;
    }
    return false;
}
public static void main(String[] args) {
    String s = "(){}[]";
    Stack <Character> s1 = new Stack<>();
    for(int i = 0; i<s.length();i++){
        char current =s.charAt(i);
        if(isOpening(current)){
            s1.push(current);
        }
        else{
            if(s1.isEmpty()){
                return false;
            }
            else if (isMatching(s1.p, current)) {
                
            }
        }

    }

}
}
