
public class PropulsionPlaneBuilder implements Builder {
	
	int numberOfSeats;
	int maximumBaggageWeight;
	int numberOfWindows;
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	};
	
	public void setMaximumBaggageWeight(int maximumBaggageWeight) {
		this.maximumBaggageWeight = maximumBaggageWeight;
	};
	
	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	};
	
	public PropulsionPlane getResult() {
		
		PropulsionPlane plane = new PropulsionPlane(numberOfSeats, maximumBaggageWeight, numberOfWindows);
		
		return plane;
	};
}
