import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("/Users/aliosmandurmaz/Desktop/java/javaDemos/readinFileDemo/src/sayilar.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total+=Integer.valueOf(line);
            }
            System.out.println("Toplam ="+total);
        }catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }catch (Exception exception) {
            exception.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (Exception exception) {

            }
        }

    }
}
