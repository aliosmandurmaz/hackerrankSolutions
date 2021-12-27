public class Main {

    public static void main(String[] args) {

        try{
            int[] sayilar = {1,2,3};

            System.out.println(sayilar[4]);
        }catch (Exception exception) {
            System.out.println(exception);
        }finally {
            System.out.println("ben her türlü çalışırım");
        }
    }
}
