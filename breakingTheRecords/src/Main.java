public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int maxScore = scores.get(0);
        int minScore = scores.get(0);
        int sayac = 0;
        int sayac1 = 0;

        List<Integer> osman = new ArrayList<>();
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) < minScore ){
                minScore = scores.get(i);
                sayac+=1;
            }
            if (scores.get(i) > maxScore){
                maxScore = scores.get(i);
                sayac1+=1;
            }

        }
        osman.add(sayac1);
        osman.add(sayac);

        return osman;
    }
}
