public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int karsilastir = 0;
        int karsilastir1 = 0;
        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) > b.get(i)) {
                karsilastir = karsilastir + 1;
            } else if(a.get(i) < b.get(i)){
                karsilastir1 = karsilastir1 + 1;
            }


        }
        List<Integer> osman = new ArrayList<>();
        osman.add(karsilastir);
        osman.add(karsilastir1);

        return osman ;
    }
}
