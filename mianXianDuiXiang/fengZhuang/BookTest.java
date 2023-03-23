//题目：编写一个book类，有页数和书名两个属性
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
		S.p("页数错误");
		page = 200;
		return;
		
	}
	page = p;

	}

public void setPage(int p)
{
	/*	  //这几行代码没用，p<200也不会提示错误
	if(p < 200)
	{
		S.p("页数错误");
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
	
	S.p("页数"+" "+page);
    S.p("neme"+" "+name);
}

}