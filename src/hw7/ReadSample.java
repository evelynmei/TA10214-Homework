package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadSample {
    public static void main(String[] args) {
    //請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
    //Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
        try{
            String path = "C:\\TIA102_Workspace\\TA10214-Homework\\src\\hw7\\Sample.txt";
            int countByte = 0;
            int countChar = 0;
            int countLine = 0;
            File file = new File(path);
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            countByte = (int) file.length();
            int i ;
            while( (i= br.read()) != -1){
                countChar ++;

            }
            String line;

            br.close();
            fr.close();

            fr = new FileReader(path);
            br = new BufferedReader(fr);
            while((line = br.readLine()) != null){
                countLine ++;
            }

            System.out.printf("Sample.txt檔案共有%d位元組,%d個字元,%d列資料", countByte, countChar, countLine);

            br.close();
            fr.close();

        }catch(IOException e){

        e.printStackTrace();
        }



    }
}
