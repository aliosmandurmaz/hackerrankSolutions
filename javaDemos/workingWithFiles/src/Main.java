import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    public static void createFile() {
        File file = new File("/Users/aliosmandurmaz/Desktop/java/javaDemos/workingWithFiles/src/osman.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void getInfoFile() {
        File file = new File("Users/aliosmandurmaz/Desktop/java/javaDemos/workingWithFiles/src/osman.txt");

        if (file.exists()) {
            System.out.println("Dosya adı: "+file.getName());
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
        }
    }

    public static void readFile() {
        File file = new File("Users/aliosmandurmaz/Desktop/java/javaDemos/workingWithFiles/src/osman.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Users/aliosmandurmaz/Desktop/java/javaDemos/workingWithFiles/src/osman.txt"));
            writer.write("ahmet");
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
