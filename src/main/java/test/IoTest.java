package test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Author ZhangJian
 * Time 2017/2/13
 */
public class IoTest {
    public static void main(String[] args) {
        fileOutPutTest();
        System.out.printf(fileInputSteamTest());
    }

    static void fileOutPutTest() {
        File f = new File("d:\\1.txt");
        String str = "this is  a test";
        try {
            OutputStream o = new FileOutputStream(f);
            try {
                o.write(str.getBytes());
                o.flush();
                o.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static String fileInputSteamTest() {
        StringBuilder sb = new StringBuilder();
        try {
//            InputStream inputStream = new FileInputStream("d:\\1.txt");
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("d:\\1.txt"));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
