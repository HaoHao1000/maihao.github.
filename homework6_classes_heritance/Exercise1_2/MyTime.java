package Exercise1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        int newSecond = ++second;
        MyTime newTime = new MyTime(hour,minute,second);
        if (hour == 23 && minute == 59 && newSecond == 60) {
            hour = 0;
            minute = 0;
            newSecond = 0;
        } else if (newSecond == 60) {
            newSecond = 0;
            ++minute;
        }
        return newTime = new MyTime(hour,minute,newSecond);
    }



    public MyTime nextMinute() {
        int newMinute = ++minute;
        MyTime newTime = new MyTime(hour,minute,second);
        if (hour == 23 && newMinute == 59 && second == 60) {
            hour = 0;
            minute = 0;
            second = 0;
        } else if (newMinute == 60) {
            newMinute = 0;
            ++hour;
        }
        return newTime = new MyTime(hour,newMinute,second);
    }

    public MyTime nextHour() {
        ++hour;
        if (hour == 24 && minute == 59 && second == 60) {
            hour = 0;
            minute = 0;
            second = 0;
        } else if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousHour() {
        --hour;
        if (hour == 24 && minute == 59 && second == 60) {
            hour = 0;
            minute = 0;
            second = 0;
        }
        return this;
    }

    public MyTime previousMinute() {
        --minute;
        if (minute == 60) {
            minute = 0;
            ++hour;
        }
        return this;
    }

    public MyTime previousSecond() {
        --second;
        if (second == 60) {
            second = 0;
            ++minute;
        }
        return this;
    }


}
