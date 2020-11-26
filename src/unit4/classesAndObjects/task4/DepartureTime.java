package unit4.classesAndObjects.task4;

public class DepartureTime implements Comparable<DepartureTime> {
    private int hours;
    private int minutes;

    public DepartureTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public int compareTo(DepartureTime dt) {
        int timeInMinutes1 = this.hours * 60 + this.minutes;
        int timeInMinutes2 = dt.getHours() * 60 + dt.getMinutes();
        return timeInMinutes1 - timeInMinutes2;
    }

    @Override
    public String toString() {
        return String.format("departureTime: %02d:%02d", hours, minutes);
    }
}
