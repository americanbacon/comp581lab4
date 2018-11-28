package lab4;

public class Playground {

	// Making sure Charlie's new stuff works
	public static void main(String[] args) {
		Charlie charlie = new Charlie();
//		charlie.printPos();
//		charlie.buttonWait();
//		charlie.turnInPlaceRight(90);
//		charlie.printPos();
//		charlie.buttonWait();
//		charlie.turnInPlaceLeft(90);
//		charlie.printPos();
//		charlie.buttonWait();
		
//		charlie.spin();
		
		charlie.printPos();
		charlie.buttonWait();
//		charlie.rotateToMLine();
		charlie.moveTillTouch();
		charlie.printPos();
		charlie.moveBackwardDist(0.15);
		charlie.printPos();
		charlie.buttonWait();
	}
}
