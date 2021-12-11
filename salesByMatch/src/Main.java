public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int sayac = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer coraplar : ar) {
            if (map.containsKey(coraplar)){
                map.put(coraplar,map.get(coraplar)+1);
            }else {
                map.put(coraplar,1);
            }

        }
        for(Map.Entry<Integer,Integer> osmanMap : map.entrySet()) {
            sayac += osmanMap.getValue() / 2;
        }
        return sayac;

    }
}
