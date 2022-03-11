package Pliki;

import java.io.*;

public class FilesHandling {


    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("user.dir"));

        String path = "src/main/resources/Plik.txt";


        File file = new File(path);
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        read();

    }

    private static void safeToFile() {
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("src/test/java/com/pliki/plik.txt");
//            for (String uczestnik : uczestnicy) {
//                fileWriter.write(uczestnik + "\n");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Zapis do pliku - Success");
//        }
        String[] uczestnicy = {"Ilona", "Irina", "Ania"};
        try (FileWriter fileWriter2 = new FileWriter("src/main/resources/Plik.txt")) {
            for (String uczestnik : uczestnicy) {
                fileWriter2.write(uczestnik + "\n");
            }
            System.out.println("Zapis do pliku - Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void read() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Plik.txt"))) {
            String input;
            while ((input = br.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
