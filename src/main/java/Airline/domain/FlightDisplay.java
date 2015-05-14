package Airline.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by student on 2015/04/26.
 */
public interface FlightDisplay {
    public String getID();
    public Date getDepartureTime();
    public Date getArrivalTime();
    public String getDepartureLocation();
    public String getArrivalLocation();
    public String displayFlightTimes();
    public String displayFlightLocations();
    public List<Ticket> getTickets();

}
