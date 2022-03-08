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
    
    public static void TravelBy(Transportation _transp) {
        System.out.println("==TravelBy==========");
        for (Person aPerson  : people)
        {
            if (aPerson instanceof Student)
            {
                if (  ((Student)aPerson).getTransportation() == _transp    )
                {
                    System.out.println(aPerson.getName());
                }
            }
        }        
    }
    
    public Teacher YoungestTeacher() {
        System.out.println("==YoungestTeacher==========");
        Teacher youngestTeacher = null;
        int age = -1;
        for (Course aCourse  : courses) {
            if (aCourse != null && aCourse.getTeacher() != null) {
                if (age == -1) {
                    age = aCourse.getTeacher().getDate().getYearsOld();
                    youngestTeacher = aCourse.getTeacher();
                } else if (age > aCourse.getTeacher().getDate().getYearsOld()) {
                    age = aCourse.getTeacher().getDate().getYearsOld();
                    youngestTeacher = aCourse.getTeacher();                    
                }
            }
        }
        return (youngestTeacher);
    }
    static void GradeLevel(int _gradeLevel){
        System.out.println("=========GradeLevel============");
        for (Person aPerson  : people){
            if (aPerson instanceof Student){
                if(((Student) aPerson).gradeLevel == _gradeLevel){
                    System.out.println(aPerson.getName());
                }
            }
        }
    }
    boolean hasTeacher(Teacher _teacher){
        System.out.println("=====hasTeacher======");
        for (Course aCourse  : courses){
            if(aCourse != null){
                if(aCourse.getTeacher()==_teacher)
                    return true;
            }
        }
        return false;
    }

}