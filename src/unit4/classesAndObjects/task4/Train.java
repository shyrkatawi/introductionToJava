package unit4.classesAndObjects.task4;

class Train {
    private String destination;
    private int number;
    private DepartureTime departureTime;

    Train(String destination, int number, int hours, int minutes) {
        this.destination = destination;
        this.number = number;
        this.departureTime = new DepartureTime(hours,minutes);
    }

    int getNumber() {
        return number;
    }

    String getDestination() {
        return destination;
    }

    DepartureTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Train number: " + number +
                ", destination: " + destination +
                ", " + departureTime;
    }
}
