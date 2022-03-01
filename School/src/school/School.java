package school;

public class School {

    public static void main(String[] args) {
        Person fred = new Student("Fred",new Date(17,4,2001),Person.Gender.MALE,10,Student.Transportation.CAR);
        Date date = new Date(23,8,1998);
        Person jojo = new Student("Jojo",date,Person.Gender.FEMALE,9,Student.Transportation.WALK);
        date.setYear(2002);
        Person kiki = new Student("Kiki",date,Person.Gender.FEMALE,12,Student.Transportation.BIKE);
        Person rocky = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        Person david = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        Person jake = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        Person ronald = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        Person jazmin = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        System.out.println(Person.getNumPeople());
        System.out.println(Student.getNumStudents());
                
        System.out.println(rocky.getInfo());
        
        Person mean = new Teacher("Mr. Mean",new Date(3,11,1925),Person.Gender.MALE,57,Teacher.Supervisor.COACH);
        Person nice = new Teacher("Ms. Nice",new Date(25,12,1994),Person.Gender.FEMALE,2,Teacher.Supervisor.ADVISOR);
        

        Course biology = new Course("Biology",Course.Type.SCIENCE,2);
        Course calculus = new Course("Calculus",Course.Type.MATH,3);
        Course dance = new Course("Dance",Course.Type.ELECTIVE,2);
        
        biology.setTeacher((Teacher)mean);
        ((Teacher)mean).addCourse(biology);
        
        
        
        biology.addStudent((Student)fred);
        ((Student)fred).addCourse(biology, 3.6);
        
   
        biology.addStudent((Student)kiki);
        ((Student)kiki).addCourse(biology, 3.1);
        
        biology.addStudent((Student)jojo);
        ((Student)jojo).addCourse(biology, 2.7);
        
        biology.addStudent((Student)rocky);
        ((Student)rocky).addCourse(biology, 3.0);
        
        
        
        dance.addStudent((Student)david);
        ((Student)fred).addCourse(dance, 3.6);
        
        dance.addStudent((Student)jazmin);
        ((Student)fred).addCourse(dance, 3.6);
        
        dance.addStudent((Student)jake);
        ((Student)fred).addCourse(dance, 3.6);
        
        dance.addStudent((Student)ronald);
        ((Student)fred).addCourse(dance, 3.6);
  
        
        
        
        Person.PrintInfo();
        Course.PrintInfo();
        biology.displayStudents();
        
        biology.studentsGpaGreaterThan(3.0);
        Course.MoreStudentsThan(2);
        
        
    }
    
}