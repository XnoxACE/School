package school;



public class Student extends Person{
    public static enum Transportation{
        WALK,CAR,BUS,BIKE
    }
    private int gradeLevel;
    private Transportation transportaion;
    
    Student(){
        gradeLevel = 9;
    }
    public Student(String _name, Date _date, Gender _gender, int _gradeLevel, Transportation _transportation){
        super(_name, _date, _gender);
        gradeLevel = _gradeLevel;
        transportaion = _transportation;
        
    }
    public String getInfo(){
        return(super.getInfo() + " " + gradeLevel + " " + transportaion);
    }
    
}
