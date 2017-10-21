package hacktober.snoozify;

/**
 * Created by jcd4912 on 10/21/2017.
 */

public class Alarm {
    private int hour;
    private int minute;

    public Alarm(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {

        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
