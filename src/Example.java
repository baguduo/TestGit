//�̳У��Ǵ�һ�����е�����������һ���µ��ࡣ���е���������࣬�����ɵ���������ࡣ����͸���ӵ��һЩ��ͬ�����ʣ���������Ӹ���̳ж�����
//    ͬʱ����Ҳ������չ��һЩ�����������е����ʣ������򡢷����ȣ�������һ���Ǹ����ʵ��������չ��
//��д����д����Ҳ�������ǣ���ָ�������жԸ����еĳ�Ա�����������¶��壬���¶���ĺ�����ԭ��������ͬ�ĺ������������б�ͷ���ֵ���͡�
//���أ���ָ������������ͬ���������б�ͬ����������������ͬ�����Ͳ�ͬ��˳��ͬ���ĺ�����ϵͳ������ʱ����ݲ����б���ö�Ӧ�ĺ���ִ�С�
//��̬����ָ�����͵ı����������������͵Ķ���Ҳ����˵���԰������͵Ķ���ֵ�������ͣ��Ӷ�ʵ�ַ����Ķ�̬���á�

import java.util.*;

public class Example {
	
	public static void ShowMessage(Fruit object)//��̬
	{
		System.out.print("the fruit is " + object.name + ",it's color is " + object.color + "and it's shape is " + object.shape + ".\n");
	}

	public static void main(String[] args) 
	{
		Apple apple =new Apple("apple","red","round");
		apple.getPrice(2.5, 2.0);//����ķ���
		apple.getPrice(3, 2);//���ظ���ķ���
		apple.display();//���Ǹ���ķ���
		apple.taste("honeyed");//�����ж�����·���
		ShowMessage(apple);//��̬
		
		Pear pear =new Pear("pear","yellow","ellipse");
		pear.getPrice(4.5, 3.0);//����ķ���
		pear.getPrice(4, 3);//���ظ���ķ���
		pear.display();//���Ǹ���ķ���
		pear.taste("sweet");//�����ж�����·���
		ShowMessage(pear);//��̬

	}
}
class Fruit
{
	String name;
	String color;
	String shape;
	Float unitPrice;
	
	public Fruit()//���캯��
	{
		
	}
	public Fruit(String fruitName,String fruitColor,String fruitShape)//���캯��
	{
	    name = fruitName;
	    color = fruitShape;
	    shape = fruitShape;
	}
	public void getPrice(double fruitUnitPrice,double weight)//��������
	{
		double price = weight*fruitUnitPrice;
		System.out.print("the price of these" + name + "is  name " + price + ".\n");
	}
	public void display()
	{
		System.out.print("the fruits are" + name + ",their color is" + color + "and  shape is" + shape +".\n");
	}
}

class Apple extends Fruit
{
	public Apple(String fruitName,String fruitColor,String fruitShape)//���캯��
	{
	    name = fruitName;
	    color = fruitShape;
	    shape = fruitShape;
	}
	public void taste(String appleTaste)
	{
		System.out.print("the taste of apple is " + appleTaste + ".\n");
	}
	public void display()//��������
	{
		System.out.print("These are apples" + ",their color is " + color + " and  shape is " + shape +".\n");
	}
	public void getPrice(int fruitUnitPrice,int weight)//��������
	{
		int price = weight*fruitUnitPrice;
		System.out.print("the price of these" + name + "is  name " + price + ".\n");
	}
}
class Pear extends Fruit
{
	public Pear(String fruitName,String fruitColor,String fruitShape)//���캯��
	{
	    name = fruitName;
	    color = fruitShape;
	    shape = fruitShape;
	}
	public void taste(String pearTaste)
	{
		System.out.print("the taste of pear is " + pearTaste + ".\n");
	}
	public void display()//��������
	{
		System.out.print("These are pears" + ",their color is " + color + " and  shape is " + shape +".\n");
	}
	public void getPrice(int fruitUnitPrice,int weight)//��������
	{
		int price = weight*fruitUnitPrice;
		System.out.print("the price of these" + name + "is  name " + price + ".\n");
	}
}


