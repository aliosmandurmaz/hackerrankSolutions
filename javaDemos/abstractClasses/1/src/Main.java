public class Main {

    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomanGameCalculator();
        GameCalculator gameCalculator2 = new OlderGameCalculator();

        gameCalculator2.gameOver();

    }
}
