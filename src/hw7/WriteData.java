package hw7;

import java.io.*;
public class WriteData {
    //請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (使用
    //append功能讓每次執行結果都能被保存起來)
    public static void main(String[] args) {
        try{
            String path = ".//Data.txt";
            FileWriter fw = new FileWriter(path, true);

            for (int i = 0; i < 10; i++) {
                int random = (int) (Math.random() * 1000) + 1;

                fw.write(random+ " ");

                System.out.print(random + ",");
            }
            fw.write("\n");

            fw.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}



