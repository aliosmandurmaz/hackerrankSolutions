public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int toplam = 0;
        for (int i = 0; i < ar.size(); i++) {
            toplam = toplam + ar.get(i);
        }

        return toplam;
    }
}
