package unit4.classesAndObjects.task4;

public class Train {
    private String destination;
    private int number;
    private DepartureTime departureTime;

    public Train(String destination, int number, int hours, int minutes) {
        this.destination = destination;
        this.number = number;
        this.departureTime = new DepartureTime(hours,minutes);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Train number: " + number +
                ", destination: " + destination +
                ", " + departureTime;
    }
}
