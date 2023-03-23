public class AcountTest
{
	public static void main (String[] args)
	{
		Acount zh1 = new Acount(111,8888,1.5);
		//直接调用Acount类
		/*

		zh1.quKuan(100);
		zh1.cunKuan(88);
		zh1.quKuan(10000);
		//S.p(zh1.nianLiLu); //错误: nianLiLu 
		//在 Acount 中是 private 访问控制
		double nll = zh1.getNianLiLu();//定义一个变量
		                //接受方法的返回值
		S.p(nll);
		*/
		//用Customer类调用Acount类
		//zh1是让Acount和Customer产生关系
		Customer gk = new Customer("李明",zh1);
		gk.getAct().quKuan(888);
		gk.getAct().cunKuan(10000);
		gk.getAct().quKuan(100000);

		
	}
}
//Customer类
class Customer
{
	private String name;
	private Acount act;
	//构造方法
	public Customer(){
		
	}
	public Customer(String name,Acount act){
		this.name = name;
		this.act = act;
		
	}
	//set and get
	//name
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
		return name;
	}
	//act
	public void setAct(Acount act){
		this.act = act;
		
	}
	public Acount getAct(){
		return act;
	}
	//取款
	/*
	错误: 找不到符号
                zh1.quKuan(gkqk);
                ^
  符号:   变量 zh1
  位置: 类 Customer


	public void Qk(int gkqk){
		zh1.quKuan(gkqk);
	}
  */

}

//账户类
class Acount
{
	private int id;
	private int yuEr;
	private double nianLiLu;
	//构造方法

	public Acount()
		{
			
		}
		
	public Acount(int id,int yuEr,double nianLiLu)

		{
			//创建对象所需要的代码
			this.id = id;
			this.yuEr = yuEr;
			this.nianLiLu = nianLiLu;
			
		}
		
		//set和get
		//id
		public void setId(int id){
			//对象创建完之后，想修改id
			this.id = id;
		}
		public int getId(){
			return id;
		}
		//yuEr
		
		public void setYuEr(int yuEr){
			this.yuEr = yuEr;
		}
		public int getYuEr(){
			return yuEr;
		}
		
		
		//nianLiLu
        public void setNianLiLu(double nianLiLu){
			this.nianLiLu = nianLiLu;
		}
		public double getNianLiLu(){
			return nianLiLu;
		}
		
		//取款方法
		public void quKuan(int qk){
			if(qk > yuEr){
				S.p("钱不够");
				return;
			}
			S.p("取了 "+qk);
			yuEr -= qk; 
			S.p("余额 "+yuEr);
		}
		//存款方法
		//也可以用set方法存款取款
		public void cunKuan(int ck){
			yuEr += ck;
			//this.yuEr += ck;//this可以省略
			S.p("存了 "+ck);
			S.p("余额 "+yuEr);
			//S.p("余额 "+this.yuEr); //this可以省略
		}
		



	

	
	
}
