public class AcountTest
{
	public static void main (String[] args)
	{
		Acount zh1 = new Acount(111,8888,1.5);
		//ֱ�ӵ���Acount��
		/*

		zh1.quKuan(100);
		zh1.cunKuan(88);
		zh1.quKuan(10000);
		//S.p(zh1.nianLiLu); //����: nianLiLu 
		//�� Acount ���� private ���ʿ���
		double nll = zh1.getNianLiLu();//����һ������
		                //���ܷ����ķ���ֵ
		S.p(nll);
		*/
		//��Customer�����Acount��
		//zh1����Acount��Customer������ϵ
		Customer gk = new Customer("����",zh1);
		gk.getAct().quKuan(888);
		gk.getAct().cunKuan(10000);
		gk.getAct().quKuan(100000);

		
	}
}
//Customer��
class Customer
{
	private String name;
	private Acount act;
	//���췽��
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
	//ȡ��
	/*
	����: �Ҳ�������
                zh1.quKuan(gkqk);
                ^
  ����:   ���� zh1
  λ��: �� Customer


	public void Qk(int gkqk){
		zh1.quKuan(gkqk);
	}
  */

}

//�˻���
class Acount
{
	private int id;
	private int yuEr;
	private double nianLiLu;
	//���췽��

	public Acount()
		{
			
		}
		
	public Acount(int id,int yuEr,double nianLiLu)

		{
			//������������Ҫ�Ĵ���
			this.id = id;
			this.yuEr = yuEr;
			this.nianLiLu = nianLiLu;
			
		}
		
		//set��get
		//id
		public void setId(int id){
			//���󴴽���֮�����޸�id
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
		
		//ȡ���
		public void quKuan(int qk){
			if(qk > yuEr){
				S.p("Ǯ����");
				return;
			}
			S.p("ȡ�� "+qk);
			yuEr -= qk; 
			S.p("��� "+yuEr);
		}
		//����
		//Ҳ������set�������ȡ��
		public void cunKuan(int ck){
			yuEr += ck;
			//this.yuEr += ck;//this����ʡ��
			S.p("���� "+ck);
			S.p("��� "+yuEr);
			//S.p("��� "+this.yuEr); //this����ʡ��
		}
		



	

	
	
}
