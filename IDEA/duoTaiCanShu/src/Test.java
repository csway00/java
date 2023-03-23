public class Test {
    public static void showGongZi(YuanGong yg) {
//        System.out.println()println
        yg.getAnnual();
    }

    //工作方法
    public static void testWork(YuanGong yg) {
        if (yg instanceof PuTonngYuanGong) {
            ((PuTonngYuanGong) yg).work();//向下转型
        } else if (yg instanceof JingLi) {
            ((JingLi) yg).manage();
        }
    }
}

