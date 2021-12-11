public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer kus : arr) {
            if (map.containsKey(kus)) {
                map.put(kus, map.get(kus) + 1);
            } else {
                map.put(kus, 1);
            }
        }

        int sayac = 0;
        int kusunAdi = 0;
        for (Map.Entry<Integer, Integer> osman : map.entrySet()) {

            if (osman.getValue() > sayac){
                sayac = osman.getValue();
                kusunAdi = osman.getKey();
            }
        }

        return kusunAdi;
    }
}
