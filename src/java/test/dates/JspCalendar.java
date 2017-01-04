/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.dates;

import java.text.DateFormat;
import java.util.*;

/**
 *
 * @author Matthieu
 */
public class JspCalendar {

    Calendar calendar = null;

    public JspCalendar() {
        calendar = Calendar.getInstance();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public String getMonth() {
        int mois = getMonthInt();
        String[] months = new String[]{"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
        if (mois > 12) {
            return "Hey Man tu craques!!!";
        }
        return months[mois - 1];
    }

    public int getMonthInt() {
        return 1 + calendar.get(Calendar.MONTH);
    }

    public String getDay() {
        int x = getDayOfWeek();
        String[] days = new String[]{"Dimanche", "Lundi", "Mardi", "Mercredi",
            "Jeudi", "Vendredi", "Samedi"};

        if (x > 7) {
            return "Hey Man tu craques!!!";
        }

        return days[x - 1];

    }

    public String getDate() {
        return getMonthInt() + "/" + getDayOfMonth() + "/" + getYear();

    }

    public String getTime() {
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public int getDayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getDayOfYear() {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int getWeekOfYear() {
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getWeekOfMonth() {
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public int getDayOfWeek() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getHour() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }

    public int getSecond() {
        return calendar.get(Calendar.SECOND);
    }

    

    public int getEra() {
        return calendar.get(Calendar.ERA);
    }

    public String getUSTimeZone() {
        String[] zones = new String[]{"Hawaii", "Alaskan", "Pacific",
            "Mountain", "Central", "Eastern"};

        return zones[10 + getZoneOffset()];
    }

    public int getZoneOffset() {
        return calendar.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000);
    }

    public int getDSTOffset() {
        return calendar.get(Calendar.DST_OFFSET) / (60 * 60 * 1000);
    }

    public int getAMPM() {
        return calendar.get(Calendar.AM_PM);
    }
}
