package unit1.linearPrograms;

/**
 * 5. Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
 */
class Task5 {
    public static void main(String[] args) {
        String result = task5(3666);
        System.out.println(result);
    }

    static String task5(int t) {
        int[] array = getHoursMinutesSeconds(t);
        return String.format("%02dч " + "%02dмин " + "%02dc ", array[0], array[1], array[2]);
    }

    /**
     * returns int array with:
     * array[0] = hours,
     * array[1] = minutes,
     * array[2] = seconds.
     * */
    static int[] getHoursMinutesSeconds(int seconds) {
        int hours = seconds / 3600;
        double temp = seconds - (hours * 3600);
        int minutes = (int) (temp / 60);
        seconds = (int) (temp - (minutes * 60));

        return new int[]{hours, minutes, seconds};
    }
}
