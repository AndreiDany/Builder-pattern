
public class Director {

	public void makePassengerPlane(Builder builder) {
		builder.setNumberOfSeats(64);
		builder.setNumberOfWindows(32);
	}
	
	public void makeCargoPlane(Builder builder) {
		builder.setMaximumBaggageWeight(1000);
	}
	
	
}
