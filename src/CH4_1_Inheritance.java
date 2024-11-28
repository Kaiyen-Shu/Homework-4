
public class CH4_1_Inheritance {

	public static void main(String[] args) 
	{
		RacingCar rccar1 = new RacingCar();
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		//-------------------------------------------------------
		RacingCar rccar2 = new RacingCar(1234,20.5,5);
		//-------------------------------------------------------
		rccar1.newShow();
		//-------------------------------------------------------
		rccar1.show();
		//-------------------------------------------------------
		Car car1 = new RacingCar();
		car1.setCar(1234, 20.5);
		car1.show();
		//-------------------------------------------------------
		Car cars[] = new Car[2];
		cars[0] = new Car();
		cars[0].setCar(1234,20.5);
		cars[1] = new RacingCar();
		cars[1].setCar(4567,30.5);
		for(int i=0;i<cars.length;i++)
			cars[i].show();
		//-------------------------------------------------------
		Car car2 = new Car();
		car2.setCar(1234,20.5);
		System.out.println(car2);
		//-------------------------------------------------------
		Car car3 = new Car();
		Car car4 = new Car();
		Car car5 = car3;
		System.out.println("car3與car4相同"+car3.equals(car4));
		System.out.println("car3與car5相同"+car3.equals(car5));
		//-------------------------------------------------------
		for(int i=0;i<cars.length;i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別"+cl);
		}
		//-------------------------------------------------------
		Vehicle[] vc = new Vehicle[2];
		vc[0] = new Car_2(1234,20.5);
		vc[0].setSpeed(60);
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		for(int i=0;i<vc.length;i++)
			vc[i].show();
		//-------------------------------------------------------
		for(int i=0;i<vc.length;i++)
		{
			if(vc[i] instanceof Car_2)
				System.out.println("第"+(i+1)+"個物件是Car類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
	}
}

class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
	public String toString()
	{
		String str = "車號:"+num+";汽油量:"+gas;
		return str;
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public RacingCar(int n,double g,int c)
	{
		super(n,g);
		course = c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
	
	public void newShow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}

abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}

class Car_2 extends Vehicle
{
	private int num;
	private double gas;
	
	public Car_2(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}

class Plane extends Vehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}