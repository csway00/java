public class PuTonngYuanGong extends YuanGong{
    public PuTonngYuanGong(String name, long gongZi) {
        super(name, gongZi);
    }

    public void work(){
        System.out.println("普工 "+ getName() + "正在工作");
    }

    @Override
    public void getAnnual() {
        super.getAnnual();
    }
}
