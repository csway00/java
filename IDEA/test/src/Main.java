/**
 * main函数返回值不能为void，否则会汇编出错，请使用int main(),并在最后return 0。
 * 虽然VC等windows下的编译器支持，但C/C++标准中不允许使用void main()!
 */
/**
 * public类必须以Main命名!

 import java.util */
import java.lang.String;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        double x1,y1,x2,y2;
        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();
        double jg = (x1-x2) * (x1-x2) +  (y1 - y2) * (y1 - y2);
        double  result=Math.sqrt(jg);
        System.out.println(String.format("%.2f",result ));
    }
}