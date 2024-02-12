import ecs100.*;

public class TemperatureCalculator {
	/** Constructor: Set up interface */
	public TemperatureCalculator() {
		UI.initialise();
		UI.addButton("Inch->CM", this::inchestocm);
		UI.addButton("CM->Inch", this::cmtoinches);
		UI.addButton("Formula", this::printFormula);
	}

	/** Convert from inches to cm */
	public void inchestocm() {
		double inches = UI.askDouble("inches");
		double cm = inches * 2.54;
		UI.println(inches + "in is " + cm + "centimeters" );
	}
	/** Convert from cm to inches */
	public void cmtoinches() {
		double cm = UI.askDouble("centimeters");
		double inches = cm * 0.393;
		UI.println(cm + "centimeters is " + inches + "inch" );
	}
	/** Print conversion formula */
	public void printFormula() {
		UI.println("Centimeters = inches * 2.54");
		UI.println("Inches = centimeters * 0.393");
	}
}
