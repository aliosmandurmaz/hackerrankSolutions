import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<>();

        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman = "+item+" Değer = "+sozluk.get(item));
        }
    }
}
