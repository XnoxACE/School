package school;

import java.util.Calendar;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }
    public Date(Date date) {
        day = date.day;
        month = date.month;
        year = date.year;
    }

    //Constructor
    public Date(int day_, int month_, int year_) {

        day = day_;
        month = month_;
        year = year_;
    }

    public int getDay() {
        return (day);
    }

    public int getMonth() {
        return (month);
    }

    public int getYear() {
        return (year);
    }

    public int getYearsOld() {
        month--; //day of the month is stored from index 0 to 11 (subtracted month to match with index of month)
        Calendar now = Calendar.getInstance(); //calandar instance

        //variables
        int currentYear = now.get(Calendar.YEAR); //passing in current year
        int currentMonth = now.get(Calendar.MONTH); //passing in current month (stored from index 0 to 11)
        int currentDay = now.get(Calendar.DAY_OF_MONTH); //passing in current day of the month

        // age calculation
        int age = currentYear - year; //intial year calculation
        if (month > currentMonth) { //if month is in the future age is subtracted
            age--;
        }

        if (month == currentMonth) { //if month is the same as current month and day is in the future age is subtracted by 1
            if (day > currentDay) {
                age--;
            }
        }
        month++; //adding back to month so that month doesn't change

        return (age);
    }

    public String getInfo() {
        return (day + " " + month + " " + year + " " + getYearsOld());
    }
    public Date getDate(){
        return(new Date(this));
    }
    
    public void setYear(int _year) {
        year = _year;
    }
    public void setDate(int day_, int month_, int year_) {

        day = day_;
        month = month_;
        year = year_;
    }
    public void setDate(Date date) {

        day = date.day;
        month = date.month;
        year = date.year;
    }
}


