public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long toplam = 0;

        for (int i = 0; i < ar.size(); i++) {
            toplam = toplam + ar.get(i);

        }
        return toplam;

    }
}
