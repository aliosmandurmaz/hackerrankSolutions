import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);

        System.out.println(minimumDistances(list));

    }

    public static int minimumDistances(List<Integer> a) {

        int minDist = a.size();

        for (int i = 0; i <= a.size() - 1; i++) {

            for (int j = i + 1; j < a.size(); j++) {

                if (a.get(i) == a.get(j)) {
                    if (minDist > (j - i)) {
                        minDist = j - i;
                    }
                }
            }
        }

        if (minDist == a.size()) {
            return -1;
        }

        return minDist;
    }

}
