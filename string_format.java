public class string_format {
   

    public static String formatTime(String timeLeftStr) {
        int hours = 0;
        int minutes = 0;

        if (timeLeftStr.contains("hr")) {
            String[] parts = timeLeftStr.split("hr");
            hours = Integer.parseInt(parts[0].trim());
            if (parts[1].contains("min")) {
                minutes = Integer.parseInt(parts[1].replace("min left", "").trim());
            }
        } else if (timeLeftStr.contains("min")) {
            minutes = Integer.parseInt(timeLeftStr.replace("min left", "").trim());
        }

        if (hours >= 1) {
            return hours + " hr";
        } else {
            return minutes + " min";
        }
    }

    public static void main(String[] args) {
        String timeCase1 = "11hr 58min left";
        String timeCase2 = "25 min left";

        String formattedTime1 = formatTime(timeCase1);
        String formattedTime2 = formatTime(timeCase2);

        System.out.println("Time Case 1: " + formattedTime1);
        System.out.println("Time Case 2: " + formattedTime2);
    }


    
}
