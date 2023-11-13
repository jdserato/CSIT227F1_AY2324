package Nov06;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int y = 5 / 0;
        } catch (Exception e) {

        } finally {
            System.out.println("Sumala");
        }
        
        
        try {

        } finally {

        }


        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader("../../Desktop/hello.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            // constant, but base is lower
            // 24576, 57344, 90112, 122880
            bw = new BufferedWriter(new FileWriter("hello.txt", true));

            // constant increase
            // 32768, 65536, 98304, 131072
//            FileWriter bw = new FileWriter("hello.txt", true);
            Scanner sc = new Scanner(System.in);
//            while (true) {
//                for (int i = 0; i < 100; i++) {
//                    bw.newLine();
                    bw.write("\nThis is another line for my thesis");
//                }
//                String s = sc.nextLine();
//                if (s.equals("X")) {
//                    break;
//                }
//            }
//            int a = 5 / 0;
//            return;
        } catch (FileNotFoundException e) {
            System.err.println("File is not found huhu");

        } catch (IOException e) {
            System.err.println("HMM interesting");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("IMPORTANT STUFF");
                bw.flush();
                bw.close();
                return;

            } catch (Exception e) {

            } finally {
                System.out.println("Imo mama finally");
            }
        }
    }
}
