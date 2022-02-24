package school;

public class Student extends Person {
    private static int numStudents = 0;    
    public static enum Transportation {
        WALK,CAR,BUS,BIKE
    };    
    
    private int id;    
    private int gradeLevel;
    private Transportation transportation;
    
//Constructors    
    public Student() {
        
        initStudent(9, Transportation.WALK);
    }    

    public Student(String _name,Date _date,Gender _gender,
    int _gradeLevel,Transportation _transportation) {
        super(_name,_date,_gender);
        
        initStudent(_gradeLevel, _transportation);
    }

//Accessors   
   public static void PrintInfo() {
        System.out.println("PrintInfo Student =============");

//Extended for loop ,   For each loop.        
        for (Person aPerson : people)
        {
            
            if(aPerson instanceof Student)
                System.out.println(aPerson.getInfo());
        }

//        for (int i=0;i<people.size();i++) {
//            System.out.println(people.get(i).getInfo());
//        }

    }    
    
    public int getGradeLevel() {
        return (gradeLevel);
    }  
    public Transportation getTransportation() {
        return (transportation);
    }      
    public String getInfo() {
        return (super.getInfo() + " " + gradeLevel + " " + transportation);
    }
    public int getId()
    {
        return(id);
    }    
    public int getNumStudents(){
        return(numStudents);
    }
//Mutators
    public void setGradeLevel(int _gradeLevel) {
        gradeLevel = _gradeLevel;
    }
    public void setTransportation(Transportation _transportation) {
        transportation = _transportation;
    }
    
    private void initStudent(int gradelevel_, Transportation _transportation) {
        numStudents++;
        id = numStudents;
        gradeLevel = gradelevel_;
        transportation = _transportation;
    }


    
}