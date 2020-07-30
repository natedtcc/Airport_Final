
/**
 * @author Delaware Technical Community College
 * Very simple Airplane class with airline and flight number information
 */
public class Airplane implements Comparable<Airplane> {
	private String airline;
	private int flightNumber;
	private int priority;

	public Airplane(String airline, int flightNumber, int priority) {
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.priority = priority;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return airline + flightNumber + ", priority: " + priority;
	}
	@Override
	public int compareTo(Airplane o) {
		// TODO: Implement appropriate compareTo methods for this assignment
		return 0;
	}
	
}
