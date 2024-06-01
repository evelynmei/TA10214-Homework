package hw7;

import java.io.*;

public class ObjIOStream {
    public static void main(String[] args) {

        //利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡
        //若C:\內沒有data資料夾,用程式新增這個資料夾
        File fileDir = new File(".\\data\\");
        if( !fileDir.exists() ){
            fileDir.mkdir();
        }

        File objectFile = new File(".\\data\\Object.ser");

        Pet[] pets = new Pet[4];
        pets[0] = new Dog("DeeDee");
        pets[1] = new Dog("狗勾");
        pets[2] = new Cat("Miru");
        pets[3] = new Cat("TanTan");

        //寫一個程式,能讀取Object.ser這四個物件,
        //並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)

        try{
            FileOutputStream fos = new FileOutputStream(objectFile);
            FileInputStream fis = new FileInputStream(objectFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            ObjectInputStream ois = new ObjectInputStream(fis);

            oos.writeObject(pets);

            Pet[] readPets = (Pet[])(ois.readObject());

            for (int i = 0; i < readPets.length; i++) {
                readPets[i].speak();
            }
            ois.close();
            oos.close();
            fis.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        //try-with-resources寫法, 不用關閉資源(JDK7以後)
//        try (
//                FileOutputStream fos = new FileOutputStream(objectFile);
//                FileInputStream fis = new FileInputStream(objectFile);
//
//                ObjectOutputStream oos = new ObjectOutputStream(fos);
//                ObjectInputStream ois = new ObjectInputStream(fis);
//        ) {
//            oos.writeObject(pets);
//
//            Pet[] readPets = (Pet[])(ois.readObject());
//
//            for (int i = 0; i < readPets.length; i++) {
//                readPets[i].speak();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }



    }
}
