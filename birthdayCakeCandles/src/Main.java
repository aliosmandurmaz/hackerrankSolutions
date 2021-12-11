public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int sayac = 1;
        int buyukSayi = candles.get(0);

        for (int i = 1; i < candles.size(); i++) {

            if(candles.get(i) > buyukSayi){
                buyukSayi = candles.get(i);
                sayac = 1 ;
            }else if (candles.get(i) == buyukSayi){
                sayac++;
            }

        }
        return sayac;


    }
}
