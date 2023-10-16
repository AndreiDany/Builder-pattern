
public class JetPlaneBuilder implements Builder {
	
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
	
	public JetPlane getResult() {
		
		JetPlane plane = new JetPlane(numberOfSeats, maximumBaggageWeight, numberOfWindows);
		
		return plane;
	};
}
