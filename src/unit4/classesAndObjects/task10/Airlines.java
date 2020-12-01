package unit4.classesAndObjects.task10;

import java.time.DayOfWeek;
import java.util.Date;

public class Airlines {
    public final Airline[] airlines;

    public Airlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void showAirlinesByDestination(String destination) {
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                System.out.println(airline);
            }
        }
        System.out.println();
    }

    public void showAirlinesByDay(DayOfWeek day) {
        for (Airline airline : airlines) {
            for (DayOfWeek dayOfWeek : airline.getDaysOfWeek()) {
                if (day.equals(dayOfWeek)) {
                    System.out.println(airline);
                    break;
                }
            }
        }
        System.out.println();
    }

    public void showAirlinesByDayAndAfterSpecifiedTime(DayOfWeek day, Date time) {
        for (Airline airline : airlines) {
            for (DayOfWeek dayOfWeek : airline.getDaysOfWeek()) {
                if (day.equals(dayOfWeek)) {
                    if (airline.getDepartureTime().compareTo(time) > 0) {
                        System.out.println(airline);
                    }
                    break;
                }
            }
        }
        System.out.println();
    }

}
