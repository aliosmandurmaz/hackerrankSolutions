public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String timeConversion(String s) {
        // Write your code here
        if ("PM".equals(s.substring(8)) && !"12".equals(s.substring(0,2))) {
            return Integer.valueOf(s.substring(0, 2)) + 12 + s.substring(2, 8);
        }
        if ("12".equals(s.substring(0, 2)) && "AM".equals(s.substring(8))) {
            return "00" + s.substring(2,8);

        }

        return s.substring(0, 8);

    }
}
