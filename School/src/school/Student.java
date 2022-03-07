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
        for (int i=0;i<Course.NUM_SECTIONS;i++)
            gradeScores[i] = -1;
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
    public double getGPA() {
        int numGrades = 0;
        double sum = 0;
        for (double val : gradeScores)
        {
            if (val >= 0) {
                sum += val;
                numGrades++;
            }
        }
        if (numGrades == 0)
            return (0);
        return (sum/numGrades);
    }
    public String getInfo() {    
        return (super.getInfo() + " " + gradeLevel + " " + transportation  + " " + id + " " + getGPA()
        + " " + (courses[0] == null ? "No Course"  :  courses[0].getName() ) 
        + " " + (courses[1] == null ? "No Course"  :  courses[1].getName() )
        + " " + (courses[2] == null ? "No Course"  :  courses[2].getName() )
        + " " + (courses[3] == null ? "No Course"  :  courses[3].getName())    );
        
        
    }
    
//Mutators
    public void setGradeLevel(int _gradeLevel) {
        gradeLevel = _gradeLevel;
    }
    public void setTransportation(Transportation _transportation) {
        transportation = _transportation;
    }
    public void addCourse(Course _course,double _gradeScore) {
        
//Make sure the period of the course is not outside the valid periods.        
        if (_course.getPeriod() < 0 || _course.getPeriod() >= Course.NUM_SECTIONS)
            return;
//Don't add the course if the period already has another course.        
        if (courses[_course.getPeriod()] != null)
            return;
        courses[_course.getPeriod()] = _course;
        gradeScores[_course.getPeriod()] = _gradeScore;
    }  



//Queries==========================
    static void TravelBy(Transportation transportation_){
        System.out.println("======TravelBy======");
        for (Person aPerson  : people)
        {
            if (aPerson instanceof Student){
                if(((Student) aPerson).transportation == transportation_){
                    System.out.println(aPerson.getName());
                }
            }           
        }   
    }
    
    Teacher YoungestTeacher(Student _student){
        Teacher youngt = null;
        int age = 110;
        for (Person aPerson  : people)
        {
            if (aPerson instanceof Student){
                
                for(int i = 0; i < ((Student) aPerson).courses.length; i++){
                    
                    if(((Student) aPerson).courses[i] != null){
                        
                        Date date = new Date(((Student) aPerson).courses[i].getTeacher().getDate());
                        if(date.getYearsOld() < age){
                            age = date.getYearsOld();
                            youngt = ((Student) aPerson).courses[i].getTeacher();
                        }               
                    }
                }
                
            }
        }
        return youngt;
    }
}