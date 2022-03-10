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
        Person nice = new Teacher("Ms. Nice",new Date(25,12,1994),Person.Gender.FEMALE,2,Teacher.Supervisor.ADVISOR);
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
        ((Teacher)nice).addCourse(speech);  //period 0  
        apush.setTeacher((Teacher)nice);
        ((Teacher)nice).addCourse(apush);  //period 1

//        biology.setTeacher((Teacher)mean);
//        ((Teacher)mean).addCourse(biology);  //period 2
        
        dance.setTeacher((Teacher)mean);
        ((Teacher)mean).addCourse(dance);  //period 2
        calculus.setTeacher((Teacher)mean);
        ((Teacher)mean).addCourse(calculus);  //period 3

        
        
        spanish.setTeacher((Teacher)hudson);
        ((Teacher)hudson).addCourse(spanish);  //period 1 

        
        
//        calculus.setTeacher((Teacher)gonzalez);
//        ((Teacher)gonzalez).addCourse(calculus);  //period 3
        biology.setTeacher((Teacher)gonzalez);
        ((Teacher)gonzalez).addCourse(biology);  //period 2
 
        stats.setTeacher((Teacher)gonzalez);
        ((Teacher)gonzalez).addCourse(stats);  //period 3
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
        biology.studentsGpaGreaterThan(3.4);
        
        Course.MoreStudentsThan(2);
        
        Student.TravelBy(Student.Transportation.BIKE);
        
//easy to do        
        Course.FemaleTeacher();
        
//medium challenging        
        if (  ((Teacher)hudson).TeachesType(Course.Type.HISTORY))
            System.out.println(hudson.getName() + " does teach " + Course.Type.HISTORY);
        else
            System.out.println(hudson.getName() + " does not teach " + Course.Type.HISTORY);
        
//medium challenging
        Teacher teacher = Teacher.MostYears();
        if (teacher != null)
            System.out.println(teacher.getName() + " has taught the longest.");
        
//Very challenging        
        Teacher.CourseType(Course.Type.ENGLISH);
        
        
//Very challenging
        Student student = (Student)koko;
        teacher = student.YoungestTeacher();
        if (teacher != null)
            System.out.println(teacher.getName() +
            " is " + student.getName() + "'s youngest teacher.");
        
                //Challenging
        //For a given teacher, return true if the passed in student is in the teachers class.
        //Return false if the student is not in the teacher's class.
        student = (Student)manny;
        teacher = (Teacher)gonzalez;
        if (teacher.Teaches(student))
            System.out.println(teacher.getName() + " does teach " + student.getName());
        else
            System.out.println(teacher.getName() + " does not teach " + student.getName());

        //Print the name of the teachers that teach the student with the passed in id.
        student = (Student)kiki;
        Teacher.HaveStudentId(student.getId());


        //Medium
        //For the given student, return true if the passed in teacher teaches the student.
        //Return false if the teacher does not teach the student.
        student = (Student)jojo;
        teacher = (Teacher)mean;
        if (student.hasTeacher(teacher))
            System.out.println(student.getName() + " has " + teacher.getName() + " as a teacher.");
        else
            System.out.println(student.getName() + " does not have " + teacher.getName() + " as a teacher.");

        //For a given course, return true if the course has more male students than female students.
        //Return false if the course does not have more male students than female students.
        Course course = stats;
        if (course.MoreMaleStudents())
            System.out.println(course.getName() + " has more male students.");
        else
            System.out.println(course.getName() + " does not have more male students.");

        //Easy
        //Print the name of all the students in the passed in grade level.        
        Student.GradeLevel(11);

        //For a given course, return true if the passed in student is in the course.
        //Return false if not in the course.         
        if (apush.hasStudent((Student)ann))
            System.out.println(ann.getName() + " is a student in " + apush.getName());
        else
            System.out.println(ann.getName() + " is not a student in " + apush.getName());
        
        //For a given teacher, return true if the teacher teaches the passed in period.
//Return false if teacher does not teach that period.
        int period = 1;
        if (((Teacher)hudson).hasPeriod(period))
            System.out.println(hudson.getName() + " does teach period " + period);
        else
            System.out.println(hudson.getName() + " does not teach period " + period);
        
        /*            
        */
    }
    
}




