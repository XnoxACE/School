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
    public Date(int _day,int _month,int _year) {
        day = _day;
        month = _month;
        year = _year;    
    }
    public Date(Date date) {
        day = date.day;
        month = date.month;
        year = date.year;
    }    
    
//Accessors     
    public int getDay() {
        return (day);
    }
    public int getMonth() {
        return (month);
    }
    public int getYear() {
        return (year);
    }    
    public Date getDate() {
        return (new Date(this));
    }    
    
    public int getYearsOld() {
        Calendar now = Calendar.getInstance();
        
        int currDay = now.get(Calendar.DAY_OF_MONTH);
        int currMonth = now.get(Calendar.MONTH)+1;
        int currYear = now.get(Calendar.YEAR);
        int yearsOld = currYear - year;
        if (month > currMonth)
            yearsOld--;
        else if (month == currMonth)  //same month
        {
            if (day > currDay)
                yearsOld--;
        }
        return (yearsOld);
    }
    
    public String getInfo() {
        return (getDay() + " " + getMonth() + " " + getYear());
    }

//Mutators    
    public void setYear(int _year) {
        year = _year;
    }    
    
    public void setMonth(int _month) {
        month = _month;
    }    
    
    public void setDay(int _day) {
        day = _day;
    }    
    
//Method overloading.
    public void setDate(int _day,int _month,int _year) {
        day = _day;
        month = _month;
        year = _year;          
    }
    public void setDate(Date date) {
        day = date.day;
        month = date.month;
        year = date.year;          
    }    

}