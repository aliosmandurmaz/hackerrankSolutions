public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int sayac1 = 0;
        int sayac2 = 0;

        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i) + a >= s && apples.get(i) + a <= t){
                sayac1+=1;
            }
        }
        for (int i = 0; i < oranges.size(); i++) {
            if (oranges.get(i) + b >= s && oranges.get(i) + b <= t){
                sayac2+=1;
            }
        }
        System.out.println(sayac1);
        System.out.println(sayac2);

    }
}
