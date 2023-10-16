
public class Client {

	public static void main(String[] args) {
	
		Director director = new Director();
		
		PropulsionPlaneBuilder propPlaneBuilder = new PropulsionPlaneBuilder();
		
		director.makePassengerPlane(propPlaneBuilder);
		
		PropulsionPlane passengerPropulsionPlane = propPlaneBuilder.getResult();

	}

}
