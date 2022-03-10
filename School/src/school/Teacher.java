package school;

public class Teacher extends Person {

    private static int numTeachers = 0;

    public static enum Supervisor {
        COACH, ADVISOR, LEADERSHIP, NONE
    };

    private Course courses[] = new Course[Course.NUM_SECTIONS];
    private int yearsTeaching;
    private Supervisor supervisor;

//Constructors
    public Teacher() {
        initTeacher(1, Supervisor.NONE);
    }

    public Teacher(String _name, Date _date, Gender _gender,
            int _yearsTeaching, Supervisor _supervisor) {
        super(_name, _date, _gender);
        initTeacher(_yearsTeaching, _supervisor);
    }

    private void initTeacher(int _yearsTeaching, Supervisor _supervisor) {
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
        for (Person aPerson : people) {
            if (aPerson instanceof Teacher) {
                System.out.println(aPerson.getInfo());
            }
        }
    }

    public int getYearsTeaching() {
        return (yearsTeaching);
    }

    public Supervisor getSupervisor() {
        return (supervisor);
    }

    public Course getCourse(int period) {
        return (courses[period]);
    }

    public String getInfo() {
        return (super.getInfo() + " " + yearsTeaching + " " + supervisor
                + " " + (courses[0] == null ? "No Course" : courses[0].getName())
                + " " + (courses[1] == null ? "No Course" : courses[1].getName())
                + " " + (courses[2] == null ? "No Course" : courses[2].getName())
                + " " + (courses[3] == null ? "No Course" : courses[3].getName()));
    }

//Mutators
    void setYearsTeaching(int _yearsTeaching) {
        yearsTeaching = _yearsTeaching;
    }

    void setSupervisor(Supervisor _supervisor) {
        supervisor = _supervisor;
    }

    void addCourse(Course _course) {
        courses[_course.getPeriod()] = _course;
    }

//Queries==========================
    boolean TeachesType(Course.Type _type) {
        System.out.println("==TeachesType==========");
        for (Course aCourse : courses) {
            if (aCourse != null && aCourse.getType() == _type) {
                return (true);
            }
        }
        return (false);
    }

    static Teacher MostYears() {
        System.out.println("==MostYears==========");
        Teacher mostYearsTeacher = null;
        int mostYearsNum = 0;
        for (Person aPerson : people) {
            if (aPerson instanceof Teacher) {
                if (((Teacher) aPerson).getYearsTeaching() > mostYearsNum) {
                    mostYearsNum = ((Teacher) aPerson).getYearsTeaching();
                    mostYearsTeacher = (Teacher) aPerson;
                }
            }
        }
        return (mostYearsTeacher);
    }

    static void CourseType(Course.Type _type) {
        System.out.println("==CourseType==========");
        for (Person aPerson : people) {
            if (aPerson instanceof Teacher) {
                boolean teachesType = false;
                for (Course aCourse : ((Teacher) aPerson).courses) {
                    if (aCourse != null && aCourse.getType() == _type) {
                        teachesType = true;
                    }
                }
                if (teachesType) {
                    System.out.println(aPerson.getName());
                }
            }
        }
    }

    boolean Teaches(Student student_) {
        System.out.println("====Teaches====");
        for (Course aCourse : courses) {
            if (aCourse != null) {
                for (int i = 0; i < aCourse.numStudents(); i++) {
                    if (aCourse.getStudent(i) == student_) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static void HaveStudentId(int id_) {
        System.out.println("====HaveStudentId======");
        for (Person aPerson : people) {
            if (aPerson instanceof Teacher) {
                for (int i = 0; i < ((Teacher) aPerson).courses.length; i++) {
                    if (((Teacher) aPerson).courses[i] != null) {
                        for (int j = 0; j < ((Teacher) aPerson).courses[i].numStudents(); j++) 
                            if (((Teacher) aPerson).courses[i].getStudent(j) != null) 
                                if (((Teacher) aPerson).courses[i].getStudent(j).getId() == id_)
                                    System.out.println(aPerson.getName());
                    }
                }
            }
        }
    }
    
    boolean hasPeriod(int _period){
        System.out.println("======hasPeriod======");
        if(courses[_period] != null){
            return true;
        }
        return false;
    }

}
