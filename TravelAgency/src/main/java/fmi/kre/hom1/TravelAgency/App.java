package fmi.kre.hom1.TravelAgency;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class App {
	private static List<Trip> trips;

	public static void main(String[] args) {
		initTrips();
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
			for (Trip trip : trips) {
				kSession.insert(trip);
			}
			System.out.println("Hello. To find the best trip for you answer the following questions:");
			kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}

	}

	private static void initTrips() {
		trips = new ArrayList<>();
		trips.add(new Trip("New York", Continent.NORTH_AMERICA, Interest.URBANISM, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Las Vegas", Continent.NORTH_AMERICA, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("San Francisco", Continent.NORTH_AMERICA, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		
		trips.add(new Trip("Grand Canyon", Continent.NORTH_AMERICA, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Niagara Falls", Continent.NORTH_AMERICA, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Alaska", Continent.NORTH_AMERICA, Interest.NATURE, Transportation.PLANE, Duration.MONTH));
		
		trips.add(new Trip("Mexico", Continent.NORTH_AMERICA, Interest.HISTORY, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Pearl Harbor", Continent.NORTH_AMERICA, Interest.HISTORY, Transportation.PLANE, Duration.WEEK));

		trips.add(new Trip("Iguazu Falls", Continent.SOUTH_AMERICA, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Amazonia", Continent.SOUTH_AMERICA, Interest.NATURE, Transportation.PLANE, Duration.MONTH));
		trips.add(
				new Trip("Machu Picchu", Continent.SOUTH_AMERICA, Interest.HISTORY, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Machu Picchu", Continent.SOUTH_AMERICA, Interest.HISTORY, Transportation.PLANE, Duration.WEEK));
		trips.add(
				new Trip("Rio de Janeiro", Continent.SOUTH_AMERICA, Interest.URBANISM, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Buenos Aires", Continent.SOUTH_AMERICA, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));

		trips.add(new Trip("Serengeti", Continent.AFRICA, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Nile River", Continent.AFRICA, Interest.NATURE, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Victoria Falls", Continent.AFRICA, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		
		trips.add(new Trip("Egypt", Continent.AFRICA, Interest.HISTORY, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Morocco", Continent.AFRICA, Interest.HISTORY, Transportation.PLANE, Duration.WEEK));
		
		trips.add(new Trip("Cape Town", Continent.AFRICA, Interest.URBANISM, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Tunis", Continent.AFRICA, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));

		trips.add(new Trip("Dead sea", Continent.ASIA, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Fuji", Continent.ASIA, Interest.NATURE, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Pamukkale", Continent.ASIA, Interest.NATURE, Transportation.BUS, Duration.WEEK));
		trips.add(new Trip("Bordum Peninsula", Continent.ASIA, Interest.NATURE, Transportation.BUS, Duration.MONTH));
		
		trips.add(new Trip("Angkor wat", Continent.ASIA, Interest.HISTORY, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Hiroshima", Continent.ASIA, Interest.HISTORY, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Israel", Continent.ASIA, Interest.HISTORY, Transportation.BUS, Duration.MONTH));
		trips.add(new Trip("Efes", Continent.ASIA, Interest.HISTORY, Transportation.BUS, Duration.WEEK));
		
		trips.add(new Trip("Dubai", Continent.ASIA, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Tokyo", Continent.ASIA, Interest.URBANISM, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Bangkok", Continent.ASIA, Interest.URBANISM, Transportation.PLANE, Duration.MONTH));
		trips.add(new Trip("Baku", Continent.ASIA, Interest.URBANISM, Transportation.BUS, Duration.WEEK));
		trips.add(new Trip("Moscow", Continent.ASIA, Interest.URBANISM, Transportation.BUS, Duration.MONTH));

		trips.add(new Trip("Triglav", Continent.EUROPE, Interest.NATURE, Transportation.BUS, Duration.WEEK));
		trips.add(new Trip("Norway", Continent.EUROPE, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Azores", Continent.EUROPE, Interest.NATURE, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Plitvice Lakes", Continent.EUROPE, Interest.NATURE, Transportation.BUS, Duration.WEEK));
		trips.add(new Trip("Montblanc", Continent.EUROPE, Interest.NATURE, Transportation.BUS, Duration.WEEK));

		trips.add(new Trip("Rome", Continent.EUROPE, Interest.HISTORY, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Istanbul", Continent.EUROPE, Interest.HISTORY, Transportation.BUS, Duration.WEEK));
		trips.add(new Trip("Athens", Continent.EUROPE, Interest.HISTORY, Transportation.BUS, Duration.WEEK));

		trips.add(new Trip("London", Continent.EUROPE, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Paris", Continent.EUROPE, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Barcelona", Continent.EUROPE, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Lisbon", Continent.EUROPE, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Budapest", Continent.EUROPE, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));
		trips.add(new Trip("Vienna", Continent.EUROPE, Interest.URBANISM, Transportation.PLANE, Duration.WEEK));

	}
}
