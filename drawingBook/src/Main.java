public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int pageCount(int n, int p) {
        // Write your code
        int toplamSay = n / 2;
        int ondenGidis = p / 2;
        int arkGidis = toplamSay - ondenGidis;
        
        return Math.min(ondenGidis,arkGidis);



    }
}
