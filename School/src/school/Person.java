package school;
import java.util.ArrayList;


public class Person {
    //Class Variables
    public static enum Gender{
        MALE,FEMALE
    }
    
    protected static ArrayList<Person> people = new ArrayList<Person>();
    private static int numPeople = 0;
    
    //Instance Variables
    
    private String name;
    private Date date;
    private Gender gender;
    
    
    //Default Constructor
    public Person(){
        initPerson("Empty", 0, 0, 0, Gender.MALE);
    }
    public Person(String name_, Date _date, Gender _gender){
        initPerson(name_, _date.getDay(), _date.getMonth(), _date.getYear(), _gender);
    }
    //Constructor
    public Person(String name_, int day_, int month_, int year_, Gender _gender){
        initPerson(name_, day_, month_, year_, _gender);
    }
    
    private void initPerson(String _name, int _day, int _month, int _year, Gender _gender){
        numPeople++;
        name = _name;
        gender = _gender;
        if(_day == 0)
            date = new Date();
        else 
            date = new Date(_day, _month, _year);
        people.add(this);
    }
    

    
    
    
    //Accsessors
   
    public String getName(){
        return(name);
    }
    public String getInfo(){ 
        String info = name + " " + date.getInfo() + " " + gender;
        return(info);
    }
    public static int getNumPeople(){
        return(numPeople);
    }
    
    //Mutators
    public void setName(String name_){
       name = name_;
    }
    
   
}
