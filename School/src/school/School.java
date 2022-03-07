package school;

public class School {

    public static void main(String[] args) {
        Person fred = new Student("Fred",new Date(17,4,2001),Person.Gender.MALE,10,Student.Transportation.CAR);
        Date date = new Date(23,8,1998);
        Person jojo = new Student("Jojo",date,Person.Gender.FEMALE,9,Student.Transportation.WALK);
        Person kiki = new Student("Kiki",new Date(7,8,2002),Person.Gender.FEMALE,12,Student.Transportation.BIKE);
        Person rocky = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        Person ann = new Student("Ann",new Date(3,5,1999),Person.Gender.FEMALE,11,Student.Transportation.CAR);
        Person tino = new Student("Tino",new Date(26,10,2004),Person.Gender.MALE,9,Student.Transportation.WALK);
        Person koko = new Student("Koko",new Date(2,3,2005),Person.Gender.FEMALE,10,Student.Transportation.CAR);
        Person manny = new Student("Manny",new Date(7,1,2003),Person.Gender.MALE,11,Student.Transportation.BIKE);
                         
        Person mean = new Teacher("Mr. Mean",new Date(3,11,1925),Person.Gender.MALE,57,Teacher.Supervisor.COACH);
        Person nice = new Teacher("Ms. Nice",new Date(25,12, 1999),Person.Gender.FEMALE,2,Teacher.Supervisor.ADVISOR);
        Person hudson = new Teacher("Ms. Hudson",new Date(13,2,1975),Person.Gender.FEMALE,22,Teacher.Supervisor.ADVISOR);
        Person gonzalez = new Teacher("Mr. Gonzalez",new Date(4,5,1980),Person.Gender.MALE,15,Teacher.Supervisor.LEADERSHIP);        

        Course speech = new Course("Speech",Course.Type.ENGLISH,0);
        Course apush = new Course("APUSH",Course.Type.HISTORY,1);
        Course spanish = new Course("Spanish",Course.Type.FOREIGN_LANG,1);
        Course dance = new Course("Dance",Course.Type.ELECTIVE,2);
        Course biology = new Course("Biology",Course.Type.SCIENCE,2);
        Course calculus = new Course("Calculus",Course.Type.MATH,3);
        Course stats = new Course("Stats",Course.Type.MATH,3);
/////////////////////
        speech.setTeacher((Teacher)nice);
        ((Teacher)nice).addCourse(speech);
        
        speech.setTeacher((Teacher)hudson);
        ((Teacher)hudson).addCourse(speech);
        
        apush.setTeacher((Teacher)nice);
        ((Teacher)nice).addCourse(apush);

        biology.setTeacher((Teacher)gonzalez);
        ((Teacher)gonzalez).addCourse(biology);
        dance.setTeacher((Teacher)mean);
        ((Teacher)mean).addCourse(dance);

        spanish.setTeacher((Teacher)hudson);
        ((Teacher)hudson).addCourse(spanish);

        calculus.setTeacher((Teacher)mean);
        ((Teacher)mean).addCourse(calculus);
        
        stats.setTeacher((Teacher)gonzalez);
        ((Teacher)gonzalez).addCourse(stats);
/////////////////////
        speech.addStudent((Student)fred);
        ((Student)fred).addCourse(speech,3.1);     //period 0
        biology.addStudent((Student)fred);
        ((Student)fred).addCourse(biology,3.5);    //period 2
        calculus.addStudent((Student)fred);
        ((Student)fred).addCourse(calculus,3.0);   //period 3
        
        biology.addStudent((Student)jojo);
        ((Student)jojo).addCourse(biology,3.2);    //period 2
        stats.addStudent((Student)jojo);
        ((Student)jojo).addCourse(stats,3.4);      //period 3
        
        spanish.addStudent((Student)kiki);
        ((Student)kiki).addCourse(spanish,3.9);    //period 1
        biology.addStudent((Student)kiki);
        ((Student)kiki).addCourse(biology,3.7);    //period 2
        calculus.addStudent((Student)kiki);
        ((Student)kiki).addCourse(calculus,2.6);   //period 3
        
        apush.addStudent((Student)rocky);
        ((Student)rocky).addCourse(apush,3.6);      //period 1   
        biology.addStudent((Student)rocky);
        ((Student)rocky).addCourse(biology,4.0);    //period 2   
        calculus.addStudent((Student)rocky);
        ((Student)rocky).addCourse(calculus,3.8);   //period 3
                
        speech.addStudent((Student)ann);
        ((Student)ann).addCourse(speech,3.9);      //period 0 
        calculus.addStudent((Student)ann);
        ((Student)ann).addCourse(calculus,4.0);    //period 3 
        
        apush.addStudent((Student)tino);
        ((Student)tino).addCourse(apush,2.9);      //period 1
        dance.addStudent((Student)tino);
        ((Student)tino).addCourse(dance,3.5);      //period 2
        stats.addStudent((Student)tino);
        ((Student)tino).addCourse(stats,3.0);      //period 3
        
        spanish.addStudent((Student)koko);
        ((Student)koko).addCourse(spanish,4.0);    //period 1
        dance.addStudent((Student)koko);
        ((Student)koko).addCourse(dance,3.5);      //period 2
        calculus.addStudent((Student)koko);
        ((Student)koko).addCourse(calculus,3.4);   //period 3
        
        speech.addStudent((Student)manny);
        ((Student)manny).addCourse(speech,3.6);    //period 0
        apush.addStudent((Student)manny);
        ((Student)manny).addCourse(apush,3.9);     //period 1
        biology.addStudent((Student)manny);
        ((Student)manny).addCourse(biology,3.1);   //period 2
        calculus.addStudent((Student)manny);
        ((Student)manny).addCourse(calculus,4.0);  //period 3
         
//////////////////////////////        
        biology.studentsGpaGreaterThan(2.4);
        
        Course.MoreStudentsThan(2);
        
        Student.TravelBy(Student.Transportation.BIKE);
        
        Course.FemaleTeacher();
        
        if(((Teacher)hudson).TeachesType(Course.Type.FOREIGN_LANG))
            System.out.println(hudson.getName() + " does teach " + Course.Type.FOREIGN_LANG);
        else
            System.out.println(hudson.getName() + " does not teach " + Course.Type.FOREIGN_LANG);
        
        
        Teacher teacher = Teacher.MostYears();
        if(teacher != null)
            System.out.println(teacher.getName() + " has taught the longest.");
        
        Teacher.CourseType(Course.Type.ENGLISH);
        
        Student student = ((Student)koko);
        teacher = student.YoungestTeacher();
        if(teacher != null)
            System.out.println(teacher.getName());
        
    }
    
}