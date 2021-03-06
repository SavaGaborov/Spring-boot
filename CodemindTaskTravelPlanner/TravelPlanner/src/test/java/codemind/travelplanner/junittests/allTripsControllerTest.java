/*package codemind.travelplanner.junittests;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import codemind.travelplanner.trip.Trip;
import codemind.travelplanner.trip.TripController;
import codemind.travelplanner.trip.TripService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( loader=AnnotationConfigContextLoader.class)
public class allTripsControllerTest {
	
	@Autowired
	TripController tripController;
	
	@Autowired
	TripService tripService;
	
	private MockMvc mockObject;
	
	public void setupValues()
    {
        // Test Purchase
        Trip trip = new Trip();
        trip.setId(100);
        trip.setDestination("Zimbabwe");
        trip.setStartDate(new Date("2017-10-10"));
        trip.setEndDate(new Date("2017-10-17"));
        trip.setComment("Exotic south African republic");
        
        mockObject = MockMvcBuilders.standaloneSetup(tripController).build();
        tripService.addTrip(trip);
    }

	@Test
	public void testGetAllTrips() throws Exception
	{
		 mockObject
					.perform(get("/trips", 100).accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk())
					.andExpect(status().isOk());
	}

}*/
