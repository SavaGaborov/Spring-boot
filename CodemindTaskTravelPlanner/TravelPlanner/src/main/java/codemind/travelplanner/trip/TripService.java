package codemind.travelplanner.trip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {
	
	@Autowired
	private TripRepository tripRepository;
	
	public List<Trip> getAllTrips(){
		List<Trip> trips = (List<Trip>) tripRepository.findAll();

		return trips;
	}
	
	
	public List<Trip> getTrip(String destination) {
		List<Trip> trip = tripRepository.findByDestination(destination);
		return trip;
	}

	public void addTrip(Trip trip) {
		tripRepository.save(trip);
		
	}

	public void updateTrip(String id, Trip trip) {
		tripRepository.save(trip);
	}

	public void deleteTopic(String id) {
		tripRepository.delete(id);
	}


}
