public class Test
{
	public static void main(String[] a){
		Animal dw = new Animal();
		Animal dog = new Dog();
		
		Animal cat = new Cat();
		Moster zr = new Moster();
		//zr.feed(dog);//������ι Dog@1be6f5c3
		//zr.feed(dog.eat()); //����: �˴�������ʹ�� '��' ����
		//zr.feed(Animal); //����: �Ҳ�������
		zr.feed(dog);
		zr.feed(cat);

		
	}
}
//������
class Animal
{
	String name;
	public void eat(){
		
	}
}
//����
class Dog extends Animal

{
	String name = "��";
	public void eat(){
		S.p("���ڳ�");
	}

}
//è��
class Cat extends Animal
{
	String name = "cat";
	public void eat(){
		S.p("è�ڳ�");
	}

}
//������
class Moster
{
	public void feed(Animal dw){
		//S.p("������ι "+dw.name);
		dw.eat();
		//����ʱ���������ᷢ��dw��Animal�࣬
		//��ȥAnimal������eat()����������ҵ��ˣ�����ͨ��
		//����ʱ���ײ�ʵ�ʵĶ�����ʲô�����Զ����õ���ʵ�ʶ����Ӧ��eat()�����ϡ�
		//����Ƕ�̬��ʹ��

	}
}