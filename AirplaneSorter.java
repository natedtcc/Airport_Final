import java.util.LinkedList;
import java.util.Queue;

/*
 *   Nathan Nasteff
 *   Delaware Tech
 *   Spring 2019
 */

public class AirplaneSorter {
	static Airplane plane1 = new Airplane("AA", 4992, 1);
	static Airplane plane2 = new Airplane("DL", 1345, 2);
	static Airplane plane3 = new Airplane("AA", 4531, 1);
	static Airplane plane4 = new Airplane("DL", 9873, 2);
	static Airplane plane5 = new Airplane("AA", 3414, 3);
	static Airplane plane6 = new Airplane("DL", 2366, 1);
	
	static Airplane airplaneArray[] = {plane1, plane2, plane3, plane4, plane5, plane6};
	static HeapSort sortPlanes;
	static Queue<Airplane> runway = new LinkedList<>();
	
	public static void main(String[] args) {
		sortAirplaneArray(airplaneArray);
		addAirplanesToQueue(airplaneArray);
		displayRunwayStatus();
	}



	private static void sortAirplaneArray(Airplane[] airplanes) {
		// TODO Implement method to call a merge sort
		// The heap sort should sort the planes in increasing order of priority
		sortPlanes.sort(airplanes);
	}
	private static void addAirplanesToQueue(Airplane[] airplanes) {
		// TODO Implement method to take all planes in the static array airplaneArray and add them into the queue runway
		for (int i=0; i<airplanes.length;i++){
			runway.add(airplanes[i]);
		}
	}
	
	private static void displayRunwayStatus() {
		System.out.println(runway);
		
	}

}

