public class Main {

    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();
        krediUI.hesapla(new OgretmenKrediManager());
        krediUI.hesapla(new TarımKrediManager());

    }
}
