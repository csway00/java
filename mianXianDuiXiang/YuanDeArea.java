//计算圆的面积
public class YuanDeArea
{
	public static void main(String[] args){
		Cir c = new Cir();
		PassObject po = new PassObject();
		po.printArea(c,5);
		
	}
	
}
class Cir
{
	double banJin;
	//构造方法
	public Cir(){
		
	}
	public Cir(double banJin){
		this.banJin = banJin;
	}
	public double Area(double banJin){
		//int area = Math.PI * banJin * banJin;
		return Math.PI * banJin * banJin;
	}
	public void setBanJin(double banJin){
		this.banJin = banJin;
	}
}
class PassObject
{
	public void printArea(Cir c,int times){
		S.p("半\t面积");
		for (int i = 1;i<= times ;i++ )
		{
			c.setBanJin((double)i);//修改c对象的半径值
			c.Area((double)i);
			S.p((double)i + "\t" + c.Area((double)i));
		}
		
	}
}