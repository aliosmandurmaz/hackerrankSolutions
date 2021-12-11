public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int a = 0;
        int toplam = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            for (int j = 0; j < m; j++) {
                toplam = toplam + s.get(i + j);
            }
            if (toplam == d) {
                a += 1;
            }
            toplam = 0;
        }
        return a;
    }
}
