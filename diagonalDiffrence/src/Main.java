public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int toplam1 = 0;
        int toplam2 = 0;


        for (int i = 0; i < arr.size(); i++) {

            toplam1 = toplam1 + arr.get(i).get(i);
            toplam2 = toplam2 + arr.get(i).get(arr.size() - i - 1);

        }
        int toplam3 = Math.abs(toplam1 - toplam2);
        return toplam3;

    }
}
