public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String dayOfProgrammer(int year) {
        // Write your code here


        if ((year < 1918 && year % 4 == 0) || (year > 1918 &&(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))) {
            return  "12.09." + year;
        } else if(year == 1918) {
            return "26.09.1918";
        }
        return "13.09." + year;



    }
}
