package lab4;

public class Playground {

	// Making sure Charlie's new stuff works
	public static void main(String[] args) {
		Charlie_3 charlie = new Charlie_3();
		charlie.printPos();
		charlie.buttonWait();
//		charlie.turnInPlaceRight(90);
//		charlie.printPos();
//		charlie.buttonWait();
//		charlie.turnInPlaceLeft(90);
//		charlie.printPos();
//		charlie.buttonWait();
		
//		charlie.spin();
		

//		charlie.rotateToMLine();
//		charlie.moveTillTouch();
//		charlie.moveTillSense(.10);
//		charlie.printPos();
//		charlie.moveBackwardDist(0.15);
		charlie.turnInPlaceRight(45);
		charlie.printPos();
		charlie.buttonWait();
		charlie.turnInPlaceRight(90);
		charlie.printPos();
		charlie.buttonWait();
		charlie.turnInPlaceRight(180);
		charlie.printPos();
		charlie.buttonWait();
		charlie.turnInPlaceRight(360);
		charlie.printPos();
		charlie.buttonWait();
		
//		charlie.jingleBells();
//		charlie.buttonWait();
//		charlie.merryChristmas();
	}
}
