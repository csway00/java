public class CaiShuGame
{
	public static void main(String[] agrs){
		while(true){
		    B.can(50);
		}
	}
}
class A
{
	public static int shu(){
	java.util.Scanner s = new java.util.Scanner(System.in);
	int sr = s.nextInt(); 
	return sr;
	}
}
class B
{
	public static void can(int c){
		int b = A.shu();
		//System.out.println(b);
		//System.out.println(A.shu().sr); //错误：无法取消引用int
		//int sr1 = sr
		
		if(c > b)
		{
			S.p("小了");
		}
		else if(c < b)
		{
			S.p("大了");
		}
			else
				{
					S.p("和了");
					System.exit(0);
				}
				
	}
}