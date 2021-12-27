public class Main {

    public static void main(String[] args) {

        System.out.println(howManyGames(16,2,1,9981));

    }

    public static int howManyGames(int p, int d, int m, int s) {

            int orderCount = 0;
            int sum = 0;

        do {
          if (p>m) {
              sum = sum + p;
              p-=d;
          } else {
              sum = sum + m;
          }
           orderCount++;
        }while (sum <= s);

        return orderCount-1;
    }

}

