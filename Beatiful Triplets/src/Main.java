import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);

        System.out.println(beautifulTriplets(3,list));

    }

    public static int beautifulTriplets(int d, List<Integer> arr) {

        int sayac = 0;

        for (Integer sayilar : arr) {
            if (arr.contains(sayilar+d) && arr.contains(sayilar+(2*d))) {
                sayac++;
            }
        }
        return sayac;
    }
}
