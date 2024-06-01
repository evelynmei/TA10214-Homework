package hw7;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
  //請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
  //呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

        CopyFile cf = new CopyFile();
        cf.copyFile("Sample.txt", "Sample_copy.txt");

    }
    public void copyFile(String inputFile, String outputFile){
        try{
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);
            BufferedReader br = new BufferedReader(fr);

            // 方法1-1: 用FileReader.read()
//            int i = fr.read();
//            while(i!=-1){
//                System.out.print((char)i);
//                fr.read();//不寫此行的話會變成i一直不等於-1的無窮迴圈
//            }

            // 方法1-2
//            int n; //先不給initial value
//            while ((n = fr.read()) != -1){
//                System.out.print((char)n);
//                fw.write((char)n);
//            }

            // 方法2: 用BufferedReader.readLine()
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
                fw.write(line + "\n");
            }
            br.close();
            fw.close();
            fr.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
