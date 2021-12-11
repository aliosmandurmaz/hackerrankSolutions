public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double pozitifSayilar = 0;
        double negatifSayilar = 0;
        double sifir          = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0) {
                pozitifSayilar = pozitifSayilar + 1;
            }else if(arr.get(i) < 0){
                negatifSayilar = negatifSayilar + 1;
            }else {
                sifir = sifir + 1;
            }

        }
        System.out.println(pozitifSayilar / arr.size());
        System.out.println(negatifSayilar / arr.size());
        System.out.println(sifir / arr.size());

    }

}
