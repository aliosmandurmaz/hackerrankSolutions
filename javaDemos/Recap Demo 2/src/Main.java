public class Main {

    public static void main(String[] args) {

        double[] mylist = {1.2, 2.4 , 3.1 , 4.5};
        double total = 0;
        double max = mylist[0];

        for (double number:mylist) {
            if (number > max) {
                max = number;
            }

            total = total + number;
            System.out.println(number);
        }

        System.out.println("toplam = " + total);
        System.out.println("en büyük = " + max);

    }
}
