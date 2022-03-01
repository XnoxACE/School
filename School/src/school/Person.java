package school;
import java.util.ArrayList;

abstract class Person {
    public static enum Gender {
        MALE,FEMALE
    };     
    
    protected static ArrayList<Person> people = new ArrayList<Person>();         
    private static int numPeople = 0; 
    private String name;
    private Date date;
    private Gender gender;
    
//Constructors    
    public Person() {
        initPerson("No Name",0,0,0,Gender.FEMALE);
    }
    public Person(String _name,int _day,int _month,int _year,Gender _gender) {
        initPerson(_name,_day,_month,_year,_gender);
    }
    public Person(String _name,Date _date,Gender _gender) {
        initPerson(_name,_date.getDay(),_date.getMonth(),_date.getYear(),_gender);
    }
    private void initPerson(String _name,int _day,int _month,int _year,Gender _gender) {
        numPeople++;
        name = _name;
        gender = _gender;
        if (_day == 0)
            date = new Date();  
        else
            date = new Date(_day,_month,_year);  
        people.add(this);
    }
            
//Accessors    
    public static int getNumPeople() {
        return (numPeople);
    }
    
    public static void PrintInfo() {
        System.out.println("PrintInfo Person=============");
//Extended for loop ,   For each loop.        
        for (Person aPerson  : people)
        {
            System.out.println(aPerson.getInfo());
        }
//        for (int i=0;i<people.size();i++) {
//            System.out.println(people.get(i).getInfo());
//        }
    }        
            
    public String getName() {
        return (name);
    }
    public Gender getGender() {
        return (gender);
    }
    public Date getDate() {
        return (date.getDate());
    }
    public String getInfo() {
        return (name + " " + date.getInfo() + " " + gender);
    }
//Mutators
    public void setName(String _name) {
        name = _name;
    }
    public void setGender(Gender _gender) {
        gender = _gender;
    }
    public void setDate(Date _date) {
        date.setDate(date);
    }
    
}