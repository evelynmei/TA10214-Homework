package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
    /*建立一個Collection物件並將以下資料加入:
    Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
    Object物件、“Snoopy”、BigInteger(“1000”)*/

        List list = new ArrayList();//有重複值, 用list
        list.add(100);
        list.add(3.14);
        list.add(21L);
        list.add(new Short("100"));
        list.add(5.1);
        list.add("kitty");
        list.add(100);
        list.add(new Object());
        list.add("Snoppy");
        list.add(new BigInteger("1000"));

        System.out.println("使用Iterator印出所有元素");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("使用for loop印出所有元素");
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }

        System.out.println("使用foreach印出所有元素");
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("移除不是java.lang.Number相關的物件");
        //list.removeIf(item -> !(item instanceof Number)); 使用Lambda

        Iterator it1 = list.iterator(); //line27-30的it被汙染,要重設新變數
        while (it1.hasNext()){
            Object obj = it1.next();
            if (!(obj instanceof Number)){
                it1.remove();
            }else{
                System.out.println(obj);

            }
        }
    }
}

