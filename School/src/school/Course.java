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

// Queries
    public void studentsGpaGreaterThan(double minGPA){
        System.out.println("=====StudentsGreaterThan=====");   
        for(int i = 0; i < students.size();i++){
            if(students.get(i).getGPA() > minGPA)
                System.out.println(students.get(i).getName());
        }        
    }
    public static void MoreStudentsThan (int minStudents){
        System.out.println("=====MoreStudentsThan=====");   
        for(int i = 0; i < courses.size();i++){
            if(courses.get(i).students.size() > minStudents)
                System.out.println(courses.get(i).name);
        }
    }
        
    
}