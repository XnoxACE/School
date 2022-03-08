package school;
import java.util.ArrayList;
public class Course {
    final public static int NUM_SECTIONS = 4;
    private static int numCourses = 0;
    public static enum Type {
        SCIENCE,ENGLISH,HISTORY,PE,FOREIGN_LANG,ELECTIVE,MATH
    };
    
    private static ArrayList<Course> courses = new ArrayList<Course>();     
    private String name;
    private Type type;
    private int period;
    
    private ArrayList<Student> students = new ArrayList<Student>(); 
    private Teacher teacher;
    
    Course() {
        initCourse("none",Type.ELECTIVE,0);
    }    
    
    Course(String _name,Type _type,int _period) {
        initCourse(_name,_type,_period);
    }
    private void initCourse(String _name,Type _type,int _period) {
        numCourses++;
        name = _name;
        type = _type;
        period = _period;
        teacher = null;
    
        courses.add(this);    
    }
    
//Accessors       
    public static int GetNumCourses() {
        return(numCourses);
    
    }
    public static void PrintInfo() {
        System.out.println("PrintInfo Course=============");
//Extended for loop ,   For each loop.        
        for (Course aCourse  : courses)
        {
            System.out.println(aCourse.getInfo());
        }
    }          
    
    
    public String getInfo() {
/*        
        if (teacher == null)
            return (name + " " + type + " " + period + " No Teacher");
        else
            return (name + " " + type + " " + period + " " + teacher.getName());
*/
//using a ternary statement.
        return (name + " " + type + " " + period + " " +
        (teacher == null ? " No Teacher" : teacher.getName()) );
    }
    
    public void displayStudents() {
        System.out.println("students in " + name + " ================");
        for (Student aStudent : students)
            System.out.println(aStudent.getName());
    }
    
    public String getName() {
        return(name);
    }    

    public Type getType() {
        return(type);
    }
    
    public int getPeriod() {
        return(period);
    }  
    
    public Teacher getTeacher() {
        return teacher;
    }
    public Student getStudent(int i) {
        return students.get(i);
    }
    public int numStudents() {
        return (students.size());
    }
//Mutators
    public void setName(String _name) {
        name = _name;
    }    
    public void setType(Type _type) {
        type = _type;
    }       
    public void setTeacher(Teacher _teacher) {
        teacher = _teacher;
    }
    public void addStudent(Student _student) {
        if (_student == null)
            return;
//Don't add the student to the course if the student is already in the course.        
        if (students.contains(_student))
            return; 

        students.add(_student);
    }
    
    
//Queries==========================
       
    public void studentsGpaGreaterThan(double gradeValue) {
       System.out.println("==studentsGpaGreaterThan==========");
//print the names of the students of this course that have a gpa 
//greater than gradeValue.
        for (Student aStudent : students) {
            if (aStudent.getGPA() > gradeValue)
                System.out.println(aStudent.getName());       
        }
    }

 

    public static void MoreStudentsThan(int numCourses) {
        System.out.println("==MoreStudentsThan==========");
        for (Course aCourse  : courses)
        {
            if (aCourse.students.size() > numCourses)
                System.out.println(aCourse.getName());
        }        
    }
    
    public static void FemaleTeacher() {
        System.out.println("==FemaleTeacher==========");
        for (Course aCourse  : courses)
        {
                if (aCourse.getTeacher() != null && 
                aCourse.getTeacher().getGender() == Person.Gender.FEMALE)
                    System.out.println(aCourse.getName());
        }           
    }
    boolean hasStudent(Student student_){
        System.out.println("hasStudent=====");
        for(int i= 0; i<students.size();i++)
            if(students.get(i) == student_)
                return true;
        
        return false;
    }
    boolean MoreMaleStudents(){
        int males = 0;
        int females = 0;
        System.out.println("=======MoreMaleStudents=======");
        
        for(int i= 0; i<students.size();i++){
            if(students.get(i).getGender() == Person.Gender.MALE){
                males++;
                
            }
            if(students.get(i).getGender() == Person.Gender.MALE){
                females++;
            }
        }
        if(males > females)
            return true;
        
        
        return false;
    }
        

}