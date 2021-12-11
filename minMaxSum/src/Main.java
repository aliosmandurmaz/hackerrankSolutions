public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long maxToplam = 0;
        long minToplam = 0;
        long toplam = 0;

        for (int i = 0; i < arr.size(); i++) {
            toplam = toplam + arr.get(i);
        }
        minToplam = toplam;

        for (int i = 0; i < arr.size(); i++) {
            long osman = toplam;
            osman = osman - arr.get(i);

            if (osman > maxToplam) {
                maxToplam = osman;
            }  if (osman < minToplam ) {
                minToplam = osman;
            }
        }

        System.out.println(minToplam+" "+maxToplam);
    }
}
