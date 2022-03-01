package school;

public class Student extends Person {
    private static int numStudents = 0;    
    public static enum Transportation {
        WALK,CAR,BUS,BIKE
    };    
    
    private int id;    
    private int gradeLevel;
    private Transportation transportation;
    private Course courses[] = new Course[Course.NUM_SECTIONS];
    private double gradeScores[] = new double[Course.NUM_SECTIONS];
//Constructors    
    public Student() {
        initStudent(9,Transportation.WALK);
    }    

    public Student(String _name,Date _date,Gender _gender,
    int _gradeLevel,Transportation _transportation) {
        super(_name,_date,_gender);
        initStudent(_gradeLevel,_transportation);
    }
    private void initStudent(int _gradeLevel,Transportation _transportation) {
        numStudents++;
        id = numStudents;
        gradeLevel = _gradeLevel;
        transportation = _transportation;
    }
    
//Accessors   
    public static int getNumStudents() {
        return (numStudents);
    }
 
    public static void PrintInfo() {
        System.out.println("PrintInfo Student=============");
//Extended for loop ,   For each loop.        
        for (Person aPerson  : people)
        {
            if (aPerson instanceof Student)
                System.out.println(aPerson.getInfo());
        }
    }         
    
    public int getId() {
        return (id);
    }      
    public int getGradeLevel() {
        return (gradeLevel);
    }  
    public Transportation getTransportation() {
        return (transportation);
    }      
    public Course getCourse(int period) {
        return(courses[period]);
    }    
    public String getInfo() {    
        
        
        return (super.getInfo() + " " + gradeLevel + " " + transportation  + " " + id + " " + getGPA()
        + " " + (courses[0] == null ? "No Course"  :  courses[0].getName()) 
        + " " + (courses[1] == null ? "No Course"  :  courses[1].getName())
        + " " + (courses[2] == null ? "No Course"  :  courses[2].getName())
        + " " + (courses[3] == null ? "No Course"  :  courses[3].getName())    );
        
        
    }
    public double getGPA(){
        double gpa = 0;
        double ac = 0;
        for(int i = 0; i<courses.length;i++)
            if(courses[i] != null){
                gpa += gradeScores[i];
                ac++;
            }
        if(ac == 0)
            return 0.0;
        return gpa/ac; 
    }
//Mutators
    public void setGradeLevel(int _gradeLevel) {
        gradeLevel = _gradeLevel;
    }
    public void setTransportation(Transportation _transportation) {
        transportation = _transportation;
    }
    public void addCourse(Course _course, double _gradeScore) {
        if(_course.getPeriod() < 0 || _course.getPeriod() >= Course.NUM_SECTIONS)
            return;
       
        if(courses[_course.getPeriod()] != null)
                return;
        
        courses[_course.getPeriod()] = _course;
        gradeScores[_course.getPeriod()] = _gradeScore;
    }    
}