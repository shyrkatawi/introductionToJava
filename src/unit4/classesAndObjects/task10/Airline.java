package unit4.classesAndObjects.task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Date;

class Airline {
    private String destination;
    private String flightNumber;
    private String planeType;
    private Date departureTime;
    private DayOfWeek[] daysOfWeek;

    Airline(String destination, String flightNumber, String planeType, String departureTime, DayOfWeek[] dayOfWeek) throws ParseException {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = new SimpleDateFormat("HH:mm").parse(departureTime);
        this.daysOfWeek = dayOfWeek;
    }

    String getDestination() {
        return destination;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    String getFlightNumber() {
        return flightNumber;
    }

    void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    String getPlaneType() {
        return planeType;
    }

    void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    Date getDepartureTime() {
        return departureTime;
    }

    void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    DayOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }

    void setDaysOfWeek(DayOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airline: " +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureTime=" + departureTime +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek);
    }
}
