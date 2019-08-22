
public class Truck extends Car{
	String payload;
	public Truck(String engine, String wheels,String payload) {
		super(engine, wheels);
		// TODO Auto-generated constructor stub
		this.payload = payload;
	}
	public String start(){
		return "tips," + engine + " is on and "+ wheels + " are running~";
	}
	public String load(){
		return payload + " is loading goods~";
	}
	
}
