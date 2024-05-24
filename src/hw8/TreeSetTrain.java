package hw8;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTrain {
    // 讓班次編號由大排到小印出,還可以不重複印出Train物件
    public static void main(String[] args) {
        Set<Train> trainList = new TreeSet<>();//根據Train的CompareTo方法,實現降冪排列

        trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainList.add(new Train(118, "自強", "高雄", "台北", 500));
        trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));

        System.out.println(trainList);
    }
}


