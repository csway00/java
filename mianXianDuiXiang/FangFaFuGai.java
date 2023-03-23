public class FangFaFuGai
{
	public static void main(String[] args){
		Date sj1 = new Date(2011,12);
		System.out.println(sj1);
		System.out.println(sj1.totring());
		/*
		结果：
		方法覆盖 2011 12
         2011 12
        方法覆盖 2011 12
         2011 12
		*/
	}


}
class Date
{
	private int year;
	private int month;
	//构造方法
	public Date(){
		
	}
	public Date(int year,int month){
		this.year = year;
		this.month = month;

		
	}
	//year
	public void setYear(int year){
		this.year = year;
		
	}
	public int getYear(){
		return year;
	}
	//month
	public void setMonth(int month){
		this.month = month;
		
	}
	public int getMonth(){
		return month;
	}
	public String totring(){
		System.out.println("方法覆盖 "+getYear()+" "+getMonth());
		return getYear()+" "+getMonth();
	}

}