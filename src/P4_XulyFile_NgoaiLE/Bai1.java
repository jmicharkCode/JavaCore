package P4_XulyFile_NgoaiLE;

import java.io.*;
import java.util.ArrayList;

public class Bai1 {
    private static final String INPUT_FILE = "D:/IT-Job/Learn/JavaCore/src/P4_XulyFile_NgoaiLE/p4_input.txt";
    private static final String OUTPUT_FILE = "D:/IT-Job/Learn/JavaCore/src/P4_XulyFile_NgoaiLE/p4_output.txt";

    public static void createFile(ArrayList<String> arr) {
        try {
            BufferedWriter br = new BufferedWriter(
                    new FileWriter(OUTPUT_FILE));
            for(int i = 0; i < arr.size(); i++) {
                br.write(arr.get(i));
                br.newLine();
            }
            br.close();
            }  catch(IOException e) {
                   e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("File dau vao: ");
       try(BufferedReader bufferReader =  new BufferedReader(new FileReader(INPUT_FILE))) {
           String line = bufferReader.readLine();
           while(line != null) {
               System.out.println(line);

               // Kiem tra xem line co "NODO training" hay khong
               if(line.contains("NODO training")) {
                   arr.add(line);
               }

               line = bufferReader.readLine();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

        createFile(arr);

        System.out.println("\n\nDu lieu ra: ");
        try(BufferedReader bufferReader =  new BufferedReader(new FileReader(OUTPUT_FILE))) {
            String line = bufferReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
