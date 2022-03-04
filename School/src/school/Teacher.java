package school;

public class Teacher extends Person {
    private static int numTeachers = 0;    
    
    public static enum Supervisor {
        COACH,ADVISOR,LEADERSHIP,NONE
    };
    
    private Course courses[] = new Course[Course.NUM_SECTIONS];
    private int yearsTeaching;
    private Supervisor supervisor;
    
//Constructors    
    public Teacher() {
        initTeacher(1,Supervisor.NONE);
    }    

    public Teacher(String _name,Date _date,Gender _gender,
    int _yearsTeaching,Supervisor _supervisor) {
        super(_name,_date,_gender);
        initTeacher(_yearsTeaching,_supervisor);
    }
    private void initTeacher(int _yearsTeaching,Supervisor _supervisor) {
        numTeachers++;
        yearsTeaching = _yearsTeaching;
        supervisor = _supervisor;
    }
    
//Accessors   
    public static int getNumTeachers() {
        return (numTeachers);
    }
 
    public static void PrintInfo() {
        System.out.println("PrintInfo Teacher=============");
//Extended for loop ,   For each loop.        
        for (Person aPerson  : people)
        {
            if (aPerson instanceof Teacher)
                System.out.println(aPerson.getInfo());
        }
    }      
    
    public int getYearsTeaching() {
        return (yearsTeaching);
    }  
    public Supervisor getSupervisor() {
        return (supervisor);
    }      
    public Course getCourse(int period) {
        return(courses[period]);
    }
    public String getInfo() {
        return (super.getInfo() + " " + yearsTeaching + " " + supervisor 
        + " " + (courses[0] == null ? "No Course"  :  courses[0].getName() ) 
        + " " + (courses[1] == null ? "No Course"  :  courses[1].getName() )
        + " " + (courses[2] == null ? "No Course"  :  courses[2].getName() )
        + " " + (courses[3] == null ? "No Course"  :  courses[3].getName())    );
    }
    
//Mutators
    public void setYearsTeaching(int _yearsTeaching) {
        yearsTeaching = _yearsTeaching;
    }
    public void setSupervisor(Supervisor _supervisor) {
        supervisor = _supervisor;
    }
        
    public void addCourse(Course _course) {
        courses[_course.getPeriod()] = _course;
    }
    boolean TeachesType(Course.Type type_){
        System.out.println("==TeachesType==");
        for (Course aCourse  : courses)
        {
            if(aCourse != null && aCourse.getType() == type_){
                return true;
            }
        }       
        return false;
    }
    static Teacher MostYears(){
        Teacher mostYearsTeacher = null;
        int mostYerasNum = 0;
        
        for (Person aPerson  : people)
        {
            if (aPerson instanceof Teacher){
                if(((Teacher) aPerson).getYearsTeaching() > mostYearsNum)
            }
                    
                
        }
        
        return mostYearsTeacher;
        
    }
}