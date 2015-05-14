package Airline.domain;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by student on 2015/04/24.
 */
@Entity
public class Aircraft implements AircraftDetails, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    private String aircraftType;
    private int seats;
    private int fuelCapacity;

    private Aircraft()
    {

    }

    public Aircraft(Builder builder)
    {
        this.ID=builder.ID;
        this.aircraftType=builder.aircraftType;
        this.seats=builder.seats;
        this.fuelCapacity=builder.fuelCapacity;
    }
    @Override
    public String getID()
    {
        return this.ID;
    }
    @Override
    public String getAircraftType()
    {
        return this.aircraftType;
    }
    @Override
    public int getSeats()
    {
        return this.seats;
    }
    @Override
    public int getFuelCapacity()
    {
        return this.fuelCapacity;
    }

    public static class Builder
    {
        private String ID;
        private String aircraftType;
        private int seats;
        private int fuelCapacity;

        public Builder(String ID)
        {
            this.ID=ID;
        }

        public Builder aircraftType(String aircraftType)
        {
            this.aircraftType=aircraftType;
            return this;
        }

        public Builder seats(int seats)
        {
            this.seats=seats;
            return this;
        }

        public Builder fuelCapacity(int fuelCapacity)
        {
            this.fuelCapacity=fuelCapacity;
            return this;
        }

        public Builder copy(Aircraft aircraft)
        {
            this.ID=aircraft.getID();
            this.aircraftType=aircraft.getAircraftType();
            this.seats=aircraft.getSeats();
            this.fuelCapacity=aircraft.getFuelCapacity();
            return this;
        }

        public Aircraft build()
        {
            return new Aircraft(this);
        }
    }
}
