//��Ŀ����дһ��book�࣬��ҳ����������������
public class BookTest

{
	public static void main(String[] args)
	{
		Book b1 = new Book(10,"fgj");
		b1.detil();
	}
}

class Book

{
	private int page;
	private String name;
public Book()
	{
		
	}
public Book(int p,String mz)
	{
	    name = mz;
		if(p < 200)
	{
		S.p("ҳ������");
		page = 200;
		return;
		
	}
	page = p;

	}

public void setPage(int p)
{
	/*	  //�⼸�д���û�ã�p<200Ҳ������ʾ����
	if(p < 200)
	{
		S.p("ҳ������");
		page = 200;
		return;

	}
	*/
	
	page = p; 

}


public int getPage()
{
	return page;
}
public void setPage(String mz)
	{
		name = mz;
	}
public String getName()
{
	return name;
}
public  void detil()
{
	
	S.p("ҳ��"+" "+page);
    S.p("neme"+" "+name);
}

}