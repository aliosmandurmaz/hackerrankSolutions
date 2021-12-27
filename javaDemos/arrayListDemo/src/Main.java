import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("sakarya");

        for (Object i : list) { // liste içinde farklı türler bulunduğu için i object biçiminde ifade edildi.
            System.out.println(i);
        }
    }
}
