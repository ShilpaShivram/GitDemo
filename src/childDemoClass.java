
public class childDemoClass extends parentClass{

	public void engineVehicle() {
		System.out.println("engine code");
	}
	
	public void colorVehicle() {
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemoClass cd = new childDemoClass();
		cd.breakVehicle();
		cd.colorVehicle();
		cd.engineVehicle();
		cd.gearVehicle();
		cd.steringVehicle();
	}

}
