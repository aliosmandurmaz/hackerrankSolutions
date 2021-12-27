import matematik.*; // bütün classları çağırır

import java.util.Scanner;

// built-in  import.java.util.Scanner; Paket örneği
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız: ");

        String isim = scanner.nextLine();

        System.out.println("Merhaba "+isim); //Kullanıcıdan data alma

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(3,9);
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();


    }
}
