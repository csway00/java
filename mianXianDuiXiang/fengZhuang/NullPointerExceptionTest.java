//��Ŀ�������ɷ����������ͣ������ǻ�������������ܹ���ʾ��ָ���쳣
public class NullPointerExceptionTest

{
	public static void main(String[] args)
	{
		Man man1 = new Man();
		Woman woman1 = new Woman();
		S.p(man1.name);
		S.p(Man.xingBie);
		

		man1.woman = woman1; //�ز�����
		//S.p(woman1.name); //1
		
		/**
		�����ã����ٵ㣨���ã����ͱ��ֵ�쳣��NullPointerException��
		�����÷��ʡ�ʵ����ص����ݡ�������ֿ�ֵ�쳣
		*/

		//System.out.println(man1.woman); //null  //2
		S.p(man1.woman.name); //NullPointerException  //2
		 
		 //3
		Woman qz = man1.woman;
		String mz = qz.name;
		S.p(mz);

		S.p("=====================");
		S.p(woman1.name);
		S.p(Woman.xingBie);
		woman1.man = man1;
		
		//S.p(man1.name); //����д��û�й����ˣ�����֤���Ϲ�����ģ�������ҵ���߼�
		S.p(woman1.man.name); //Ӧ������

	}
}

class Woman

{
	String name;
	static boolean xingBie;
		
	Man man;

	public Woman()
	{
		name = "qizi";
		
		
	}
}

class Man

{
	String name;
	
	static boolean xingBie = true;
	Woman woman;
	
	public Man()
	{
		name = "�Ϲ�";
		
		
	}
	

}

