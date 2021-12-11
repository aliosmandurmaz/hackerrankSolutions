public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int toplam = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (bill.get(i)!= bill.get(k)) {
                toplam = toplam + bill.get(i);
            }
        }
        if (toplam/2 == b){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b - (toplam/2));
        }

    }
}
