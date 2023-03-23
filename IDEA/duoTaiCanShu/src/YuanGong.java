public class YuanGong {
    private String name;
    private long gongZi;
    public YuanGong() {
    }

    public YuanGong(String name, long gongZi) {
        this.name = name;
        this.gongZi = gongZi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGongZi(long gongZi) {
        this.gongZi = gongZi;
    }

    public String getName() {
        return name;
    }

    public long getGongZi() {
        return gongZi;
    }
    //年工资
    public void getAnnual(){
        System.out.println(name+"年工资 " + 12 * getGongZi());
    }
}
