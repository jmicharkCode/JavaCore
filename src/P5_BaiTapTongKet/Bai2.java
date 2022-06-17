package P5_BaiTapTongKet;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    private static final String REGEX_SIM = "^[0-9].*,[a-zA-Z].*,[0-9].*";

    private static final String INPUT_FILE = "D:/IT-Job/Learn/JavaCore/src/P5_BaiTapTongKet/p5_input.txt";
    private static final String OUTPUT_FILE = "D:/IT-Job/Learn/JavaCore/src/P5_BaiTapTongKet/p5_output.txt";


    public static String replaceRegex(String s) {
        return s.replace(",", ".*");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap can tim kiem: ");
        String found = scan.nextLine();
        //    found = found.replace("*")
        try (BufferedReader bufferReader = new BufferedReader(new FileReader(INPUT_FILE))) {
            String line = bufferReader.readLine();
            while (line != null) {
                System.out.println(line);

                String s = replaceRegex(line);
                if (s.contains())

                    line = bufferReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}