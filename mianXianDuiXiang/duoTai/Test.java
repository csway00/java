public class Test
{
	public static void main(String[] a){
		Animal dw = new Animal();
		Animal dog = new Dog();
		
		Animal cat = new Cat();
		Moster zr = new Moster();
		//zr.feed(dog);//主人在喂 Dog@1be6f5c3
		//zr.feed(dog.eat()); //错误: 此处不允许使用 '空' 类型
		//zr.feed(Animal); //错误: 找不到符号
		zr.feed(dog);
		zr.feed(cat);

		
	}
}
//动物类
class Animal
{
	String name;
	public void eat(){
		
	}
}
//狗类
class Dog extends Animal

{
	String name = "狗";
	public void eat(){
		S.p("狗在吃");
	}

}
//猫类
class Cat extends Animal
{
	String name = "cat";
	public void eat(){
		S.p("猫在吃");
	}

}
//主人类
class Moster
{
	public void feed(Animal dw){
		//S.p("主人在喂 "+dw.name);
		dw.eat();
		//编译时，编译器会发现dw是Animal类，
		//会去Animal类中找eat()方法，结果找到了，编译通过
		//运行时，底层实际的对象是什么，就自动调用到该实际对象对应的eat()方法上。
		//这就是多态的使用

	}
}