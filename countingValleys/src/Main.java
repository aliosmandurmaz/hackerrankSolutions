public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int yukseklik = 0;
        int vadiSayisi = 0;

        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);

            if(c == 'U'){
                yukseklik++;
            }
            if(c == 'D') {
                yukseklik--;
            }
            if (yukseklik == 0 && c == 'U'){
                vadiSayisi++;
            }

        }

        return vadiSayisi;

    }
}
