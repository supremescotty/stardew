package Clock;

import Game.Game;
import Seasons.Season;

public class Clock {
    private Season season;
    private int day;
    private int hour;
    private int minute;

    public Clock() {
        this.resetClock();
    }

    public void resetClock() {
        this.hour = 6;
        this.minute = 0;
        changeDay();
    }

    public void increaseTime() {
        if (hour == 2) {
            Game.triggerPassOut();
        }
        else if (minute == 50) {
            hour += 1;
            minute = 0;
        }
        else {
            minute += 10;
        }
    }

    public void changeDay() {
        if (day == Season.getDaysInSeason()) {
            day = 1;
            season.changeSeason();
        } else {
            day += 1;
        }
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
}
