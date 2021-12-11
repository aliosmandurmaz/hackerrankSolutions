public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int a = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0 && i < j ){
                    a++;
                }
            }

        }
        return a;

    }
}
