package hw8;

import java.util.HashSet;
import java.util.Set;

public class HashSetTrain {
    public static void main(String[] args) {
        //印出不重複的Train物件
        Set<Train> set = new HashSet();
        set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        set.add(new Train(1254, "區間", "屏東", "基隆", 700));
        set.add(new Train(118, "自強", "高雄", "台北", 500));
        set.add(new Train(1288, "區間", "新竹", "基隆", 400));
        set.add(new Train(122, "自強", "台中", "花蓮", 600));
        set.add(new Train(1222, "區間", "樹林", "七堵", 300));
        set.add(new Train(1254, "區間", "屏東", "基隆", 700));

        //用 for-each
        for(Train train : set) {
            train.showTrain();
        }

        //用Iterator
        //方法一: Iterator類別宣告前加上泛型，Iterator<Train>
//        Iterator<Train>  it = set.iterator();
//        while(it.hasNext()) {
//          it.next().showTrain(); //it.next()為Train的object
//      // 方法二: 不用泛型, 要強轉
//            Train obj =  (Train)(it.next());
//            obj.showTrain();
//
//      //方法三 直接用getter
//            Train obj = it.next();
//            System.out.println("班次: " + obj.getNumber() + ",車種: " + obj.getType() + ",出發地: " + obj.getStart() + ",目的地: " + obj.getDest() + ",票價: " + obj.getPrice() );
//        }
//      //方法四 Train 裡 @Override toString 方法，而不是用 showInfo()
//            System.out.println(set);
    }
}
