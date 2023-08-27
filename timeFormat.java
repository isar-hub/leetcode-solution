public class timeFormat {
    public static String formatTime(String input) {
        // Replace "hr" with "h" and "min" with "m"
        String formatted = input.replace("hr", "h").replace("min", "m");
        return formatted;
    }
    public static void main(String[] args) {
        String s = "59min left";
        System.out.println(formatTime(s));
        
    }
    
}
