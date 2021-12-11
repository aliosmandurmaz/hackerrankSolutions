public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        // Write your code here
        String a = "YES";
        String b = "NO";
        if (v1 > v2 && (x2-x1) % (v1-v2) == 0){
            System.out.println(a);
            return a;
        }else {
            System.out.println(b);
        }
        return b;
    }
}
