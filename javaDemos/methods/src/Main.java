public class Main {

    public static void main(String[] args) {
        // Variable arguments

        int toplamaIslemi = topla(354343,435665645,3433);
        System.out.println(toplamaIslemi);
    }

    public static int topla(int ... sayilar) {
        int toplam = 0;

        for (int sayi : sayilar) {
            toplam = toplam + sayi;
        }

        return toplam;
    }
}
