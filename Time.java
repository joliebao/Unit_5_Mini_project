/**
 * The Time class represents a digital clock in military time. Military time shows up as
 * hours, minutes, and seconds
 */
public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    /**
     * Constructor for the Time class. This creates a new instance of a clock given
     * the below parameters.
     *
     * @param h represents the hours of the clock
     * @param m represents the minutes of the clock
     * @param s represents the seconds of the clock
     */
    public Time(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    /**
     * Void method for the Time class. This method will add one second
     * to the previous existing instance of time.
     * If any value is above the limit according to the time, it will reset/adjust accordingly
     */
    public void tick(){
        seconds ++;
        if (seconds >= 60){
            minutes++;
            seconds -= 60;
        }
        if (minutes >= 60){
            hours++;
            minutes -= 60;
        }
        if (hours >= 24){
            hours -= 24;
        }
    }

    /**
     * Void method for the Time class. This method will add a new instance of time
     * to the previous existing instance of time.
     * If any value is above the limit according to the time, it will reset/adjust accordingly
     */
    public void adjustTime(Time added){
        int s = added.getSeconds();
        int m = added.getMinutes();
        int h = added.getHours();

        seconds += s;
        minutes += m;
        hours += h;

        if (seconds >= 60){
            minutes++;
            seconds -= 60;
        }
        if (minutes >= 60){
            hours++;
            minutes -= 60;
        }
        if (hours >= 24){
            hours -= 24;
        }
    }

    /**
     * Accessor method for the Time class. This method will return the seconds of the instance
     *
     * @return returns an int of the seconds in the instance of time
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Accessor method for the Time class. This method will return the minutes of the instance
     *
     * @return returns an int of the minutes in the instance of time
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Accessor method for the Time class. This method will return the hours of the instance
     *
     * @return returns an int of the hours in the instance of time
     */
    public int getHours() {
        return hours;
    }

    /**
     * toString method for the Time class. This method will return a String
     * showing the time in military time format. Ex.) 00:00:00
     *
     * @return returns a String in a properly formatted military time containing all
     * the information about the Time
     */
    public String toString(){
        String h = "" + hours;
        String m = "" + minutes;
        String s = "" + seconds;
        if (hours < 10){
            h = "0" + hours;
        }
        if (minutes < 10){
            m = "0" + minutes;
        }
        if (seconds < 10){
            s = "0" + seconds;
        }
        return (h + ":" + m + ":" + s);
    }
}
