import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        YuanGong jingLi = new JingLi("小红",10000,1000);
        PuTonngYuanGong puTonngYuanGong = new PuTonngYuanGong("小明",5000);
        Test.showGongZi(puTonngYuanGong);
        Test.showGongZi(jingLi);
        //工作方法
        Test.testWork(puTonngYuanGong);
        Test.testWork(jingLi);




    }
    }