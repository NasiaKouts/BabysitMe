package com.greece.nasiakouts.babysitterfinder.Models;

import java.io.Serializable;

import static com.greece.nasiakouts.babysitterfinder.Constants.ANOKATOTELEIA;
import static com.greece.nasiakouts.babysitterfinder.Constants.DASH;

public class TimeSlot implements Serializable {
    private String day;
    private int fromHour;
    private int fromMin;
    private int toHour;
    private int toMin;
    private boolean allDay;

    public TimeSlot(String day, int fromHour, int fromMin, int toHour, int toMin, boolean allDay) {
        this.day = day;
        this.fromHour = fromHour;
        this.fromMin = fromMin;
        this.toHour = toHour;
        this.toMin = toMin;
        this.allDay = allDay;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHourRange() {
        return (fromHour == 0 ? "00" : "" + fromHour)
                + ANOKATOTELEIA + (fromMin == 0 ? "00" : "" + fromMin)
                + DASH + (toHour == 0 ? "00" : "" + toHour)
                + ANOKATOTELEIA + (toMin == 0 ? "00" : "" + toMin);
    }

    public boolean isAllDay(){
        return allDay;
    }

    public void setAllDay(boolean allDay){
        this.allDay = allDay;
    }

    public int getFromHour() {
        return fromHour;
    }

    public void setFromHour(int fromHour) {
        this.fromHour = fromHour;
    }

    public int getFromMin() {
        return fromMin;
    }

    public void setFromMin(int fromMin) {
        this.fromMin = fromMin;
    }

    public int getToHour() {
        return toHour;
    }

    public void setToHour(int toHour) {
        this.toHour = toHour;
    }

    public int getToMin() {
        return toMin;
    }

    public void setToMin(int toMin) {
        this.toMin = toMin;
    }
}
