//题目：创建丈夫类和妻子类就，让他们互相关联，并且能够演示空指针异常
public class NullPointerExceptionTest

{
	public static void main(String[] args)
	{
		Man man1 = new Man();
		Woman woman1 = new Woman();
		S.p(man1.name);
		S.p(Man.xingBie);
		

		man1.woman = woman1; //必不可少
		//S.p(woman1.name); //1
		
		/**
		空引用（空再点（引用））就变空值异常（NullPointerException）
		空引用访问‘实例相关的数据’，会出现空值异常
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
		
		//S.p(man1.name); //这样写就没有关联了，不能证明老公是你的，不符合业务逻辑
		S.p(woman1.man.name); //应该这样

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
		name = "老公";
		
		
	}
	

}

