import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Double newData = new Double( Math.sqrt(x));
        int value = newData.intValue();
        System.out.println(value);
}
}