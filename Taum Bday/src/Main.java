import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(taumBday(3,3,1,9,2));

    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {


        long minBlackPrice = (Math.min(bc,wc + z));
        long minWhitePrice = (Math.min(wc,bc + z));

        long sonuc = ((minBlackPrice*b) + (minWhitePrice*w));

       return sonuc;


    }
}
