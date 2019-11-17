package fmi.kre.hom1.TravelAgency;

public class Trip {
	private String destination;
	private Continent continent;
	private Interest interest;
	private Transportation transportation;
	private Duration duration;
	
	public Trip(String destination, Continent continent, Interest interest, Transportation transportation, Duration duration) {
		this.destination = destination;
		this.continent = continent;
		this.interest = interest;
		this.transportation = transportation;
		this.duration = duration;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Continent getContinent() {
		return continent;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	public Interest getInterest() {
		return interest;
	}
	public void setInterest(Interest interest) {
		this.interest = interest;
	}
	public Transportation getTransportation() {
		return transportation;
	}
	public void setTransportation(Transportation transportation) {
		this.transportation = transportation;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}	
	
	@Override
	public String toString() {
        return "Trip to "+destination+ " for a " +duration.name().toLowerCase()+ " by " + transportation.name().toLowerCase()+"."; 
	}
}
