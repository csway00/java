//����Բ�����
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
	//���췽��
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
		S.p("��\t���");
		for (int i = 1;i<= times ;i++ )
		{
			c.setBanJin((double)i);//�޸�c����İ뾶ֵ
			c.Area((double)i);
			S.p((double)i + "\t" + c.Area((double)i));
		}
		
	}
}