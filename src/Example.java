//继承：是从一个已有的类中派生出一个新的类。已有的类叫做父类，新生成的类叫做子类。子类和父类拥有一些共同的性质，看做子类从父类继承而来，
//    同时子类也可以拓展出一些父类所不具有的性质（数据域、方法等），子类一般是父类的实例化和拓展。
//重写（覆写）：也叫做覆盖，是指在子类中对父类中的成员函数进行重新定义，重新定义的函数和原函数有相同的函数名、参数列表和返回值类型。
//重载：是指两个函数名相同，但参数列表不同（包括参数个数不同、类型不同或顺序不同）的函数，系统在运行时会根据参数列表调用对应的函数执行。
//多态：是指父类型的变量可以引用子类型的对象，也就是说可以把子类型的对象赋值给父类型，从而实现方法的动态调用。

import java.util.*;

public class Example {
	
	public static void ShowMessage(Fruit object)//多态
	{
		System.out.print("the fruit is " + object.name + ",it's color is " + object.color + "and it's shape is " + object.shape + ".\n");
	}

	public static void main(String[] args) 
	{
		Apple apple =new Apple("apple","red","round");
		apple.getPrice(2.5, 2.0);//父类的方法
		apple.getPrice(3, 2);//重载父类的方法
		apple.display();//覆盖父类的方法
		apple.taste("honeyed");//子类中定义的新方法
		ShowMessage(apple);//多态
		
		Pear pear =new Pear("pear","yellow","ellipse");
		pear.getPrice(4.5, 3.0);//父类的方法
		pear.getPrice(4, 3);//重载父类的方法
		pear.display();//覆盖父类的方法
		pear.taste("sweet");//子类中定义的新方法
		ShowMessage(pear);//多态

	}
}
class Fruit
{
	String name;
	String color;
	String shape;
	Float unitPrice;
	
	public Fruit()//构造函数
	{
		
	}
	public Fruit(String fruitName,String fruitColor,String fruitShape)//构造函数
	{
	    name = fruitName;
	    color = fruitShape;
	    shape = fruitShape;
	}
	public void getPrice(double fruitUnitPrice,double weight)//方法重载
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
	public Apple(String fruitName,String fruitColor,String fruitShape)//构造函数
	{
	    name = fruitName;
	    color = fruitShape;
	    shape = fruitShape;
	}
	public void taste(String appleTaste)
	{
		System.out.print("the taste of apple is " + appleTaste + ".\n");
	}
	public void display()//方法覆盖
	{
		System.out.print("These are apples" + ",their color is " + color + " and  shape is " + shape +".\n");
	}
	public void getPrice(int fruitUnitPrice,int weight)//方法重载
	{
		int price = weight*fruitUnitPrice;
		System.out.print("the price of these" + name + "is  name " + price + ".\n");
	}
}
class Pear extends Fruit
{
	public Pear(String fruitName,String fruitColor,String fruitShape)//构造函数
	{
	    name = fruitName;
	    color = fruitShape;
	    shape = fruitShape;
	}
	public void taste(String pearTaste)
	{
		System.out.print("the taste of pear is " + pearTaste + ".\n");
	}
	public void display()//方法覆盖
	{
		System.out.print("These are pears" + ",their color is " + color + " and  shape is " + shape +".\n");
	}
	public void getPrice(int fruitUnitPrice,int weight)//方法重载
	{
		int price = weight*fruitUnitPrice;
		System.out.print("the price of these" + name + "is  name " + price + ".\n");
	}
}


