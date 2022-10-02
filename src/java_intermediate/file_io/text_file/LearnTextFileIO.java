package java_intermediate.file_io.text_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class LearnTextFileIO {

    /*
    Reading from a file
        1. Path to file
     */

    static FileInputStream fis;
    static InputStreamReader isr;
    static BufferedReader br;

    static FileOutputStream fos;
    static OutputStreamWriter osw;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
//        System.out.println("\"Addition\""); // "Addition"
//        System.out.println("This is an example of \na new-line\tcharacter-5\b");

        String absPath = System.getProperty("user.dir");
        String relPath = "\\src\\files\\sample.txt";
        String filePath = absPath + relPath;

        File file = new File(filePath);

        try {
            String strToWrite = "We are writing to files \nusing \tJava";

            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = Files.newBufferedWriter(Path.of(filePath));

            bw.write(strToWrite);
        } catch (FileNotFoundException fnf) {
            System.out.println("NO FILE EXISTS AT THE PROVIDED PATH!");
        } catch (IOException ioe) {
            System.out.println("COULD NOT READ FROM FILE. PLEASE CHECK YOUR FILE IS NOT CORRUPTED");
        } finally {
            System.out.println("FINALLY BLOCK");
            if (fos != null) {
                fos.close();
            }
            if (osw != null) {
                osw.close();
            }
            if (bw != null) {
                bw.close();
            }
        }

        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("NO FILE EXISTS AT THE PROVIDED PATH!");
        } catch (IOException e) {
            System.out.println("COULD NOT READ FROM FILE. PLEASE CHECK YOUR FILE IS NOT CORRUPTED");
        } finally {
            System.out.println("FINALLY BLOCK");
            if (fis != null) {
                fis.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (br != null) {
                br.close();
            }
        }
    }
}
