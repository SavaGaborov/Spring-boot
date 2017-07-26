package codemind.travelplanner.trip;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, String> {
	List<Trip> findByDestination(String destination);
}


