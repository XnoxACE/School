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
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<Student>(); 
    
    
    
    public Course(){
        initCourse("none", Type.ELECTIVE,0);
    }
    public Course(String _name, Type _type, int _period){
        initCourse(_name, _type, _period);
    }
    
    private void initCourse(String _name, Type _type, int _period){
       name = _name;
       type = _type;
       period = _period;
       teacher = null;
       courses.add(this);
       
    }
    public String getName(){
        return(name);
    }
    public Type getType(){
        return(type);
    }
    public int getPeriod(){
        return(period);
    }
    
    
    public void setName(String _name){
        name = _name;
    }
    public void setType(Type _type){
        type = _type;
    }
    public String getInfo() {
        return (name + " " + type + " " + period + " " +
        (teacher == null ? " No Teacher" : teacher.getName()));
    
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher _teacher){
        teacher = _teacher;
    }
    public static void PrintInfo(){
        for (Course aCourse : courses)
        {
            System.out.println(aCourse.getInfo());
        }
    }
    public void addStudent(Student _student){
        if(_student == null)
            return;
        
        if(students.contains(_student))
            return;
        
        
       students.add(_student);
    }
    public Student getStudent(int i){
        return students.get(i);
    }
    public void displayStudents(){
        System.out.println("===============================");
        System.out.println("Students in " + name);
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName());
        }
    }
    
}
