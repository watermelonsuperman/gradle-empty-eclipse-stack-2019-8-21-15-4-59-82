
public class test {
	public static void main(String[]args){
		Car car = new Car("v8引擎 ", "米其林轮胎");
		SportsCar sportCar = new SportsCar("v8引擎","米其林轮胎","炫酷灯");
		Truck truck = new Truck("v8引擎","米其林轮胎","负载车厢");
		System.out.println(car.start());
		System.out.println();

		System.out.println(sportCar.start());
		System.out.println(sportCar.speedOn());
		System.out.println();
		System.out.println(truck.start());
		System.out.println(truck.load());
	}
}
