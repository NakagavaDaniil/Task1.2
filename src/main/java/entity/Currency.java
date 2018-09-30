package entity;

import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;

public class Currency {
    int r030;
String cc;
String txt;
double rate;
String exchangedate;

    public Currency() {
    }

    public int getR030() {
        return r030;
    }

    public void setR030(int r030) {
        this.r030 = r030;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }



    @Override
    public String toString() {
        return getCc()+":"+getTxt()+":"+getRate();
    }
}
