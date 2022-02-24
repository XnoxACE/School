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
    
    
    public Course(){
        initCourse("none", Type.ELECTIVE,0);
    }
    public Course(String _name, Type _type, int _period){
        
    }
    
    private void initCourse(String _name, Type _type, int _period){
       
    }
}
