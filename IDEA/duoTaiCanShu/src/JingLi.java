public class JingLi extends YuanGong{
    private long jiangJin;
    public JingLi(){

    }

    public JingLi(String name, long gongZi,long jiangJin) {
        super(name, gongZi);
        this.jiangJin = jiangJin;
    }

    public void setJiangJin(long jiangJin) {
        this.jiangJin = jiangJin;
    }
    public long getJiangJin() {
        return jiangJin;
    }
    //manage方法
    public void manage(){
        System.out.println("经理 "+ getName()+"正在管理");
    }

    @Override
    public void getAnnual() {
        //System.out.println(super.getName()+"年工资 "+ super.getAnnual()+ jiangJin);
        //System.out.println()的参数不允许是void，所以上面代码报错：此处不允许使用 '空' 类型
        long gz = super.getGongZi()* 12+ jiangJin;
        System.out.println(super.getName()+"年工资 "+ gz);

    }
}
