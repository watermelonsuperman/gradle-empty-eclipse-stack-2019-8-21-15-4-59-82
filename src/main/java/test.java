
public class test {
	public static void main(String[]args){
		Car car = new Car("v8���� ", "��������̥");
		SportsCar sportCar = new SportsCar("v8����","��������̥","�ſ��");
		Truck truck = new Truck("v8����","��������̥","���س���");
		System.out.println(car.start());
		System.out.println();

		System.out.println(sportCar.start());
		System.out.println(sportCar.speedOn());
		System.out.println();
		System.out.println(truck.start());
		System.out.println(truck.load());
	}
}
