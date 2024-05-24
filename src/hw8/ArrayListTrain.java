package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTrain {
    // Train物件印出時,能以班次編號由大到小印出
    public static void main(String[] args) {
        List<Train> trainList = new ArrayList();
        trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainList.add(new Train(118, "自強", "高雄", "台北", 500));
        trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));

        Collections.sort(trainList);
//        trainList.sort( (a, b) -> b.getNumber() - a.getNumber());

        System.out.println(trainList);
    }
}
