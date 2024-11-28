
public class CH4_2_Interface {

	public static void main(String[] args) 
	{
		iVehicle[] ivc = new iVehicle[2];
		ivc[0] = new Car_1(1234,20.5);
		ivc[1] = new Plane_1(232);
		for(int i=0;i<ivc.length;i++)
			ivc[i].vshow();
		//-------------------------------------------------------
		Car_v_m car1 = new Car_v_m(1234,20.5);
		car1.vshow();
		car1.mshow();
	}
}

interface iVehicle
{
	int weight = 1000;
	void vshow();
}

interface iMaterial
{
	void mshow();
}

class Car_1 implements iVehicle
{
	private int num;
	private double gas;
	
	public Car_1(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void vshow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class Plane_1 implements iVehicle
{
	private int flight;
	
	public Plane_1(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void vshow()
	{
		System.out.println("飛機的班次是"+flight);
	}
}

class Car_v_m implements iVehicle,iMaterial
{
	private int num;
	private double gas;
	
	public Car_v_m(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void vshow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
	public void mshow()
	{
		System.out.println("車子的材質是鐵");
	}
}