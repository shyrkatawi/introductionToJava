package unit4.classesAndObjects.task6;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void changeTime(int hour, int minute, int second) {
        int currentTimeInSeconds = this.hour * 3600 + this.minute * 60 + this.second;
        int additionalTimeInSeconds = hour * 3600 + minute * 60 + second;
        setTimeFromSeconds(currentTimeInSeconds + additionalTimeInSeconds);
    }

    private void setTimeFromSeconds(int seconds) {
        int hours = seconds / 3600;
        double temp = seconds - (hours * 3600);
        int minutes = (int) (temp / 60);
        seconds = (int) (temp - (minutes * 60));

        setHour(hours);
        setMinute(minutes);
        setSecond(seconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
