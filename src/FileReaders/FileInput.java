package FileReaders;

import java.io.*;
import static FileReaders.FileCharsetDetector.charSetDetect;

public class FileInput {
    public static String readFile(String filePath) {
        // you should put source file under the project folder or you input the full path of the file
        String[] charSet = charSetDetect(filePath);
        StringBuilder sb = new StringBuilder();
        if (charSet.length > 0) {
            File in = new File(filePath);
            try( BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(in),charSet[0]))) {
                int charsRead =0;
                char[] crd =new char[10000];
                while ((charsRead = bufferedReader.read(crd)) != -1) {

                    sb.append(crd,0,charsRead);
                }
            }  catch (IOException e) {
                System.err.println("no file found :you should put source file under the project folder or you input the full path of the file");
                e.printStackTrace();
            }
        } else {
            System.err.println("no charset found");
            System.exit(1);
        }
        return sb.toString();
    }
}
