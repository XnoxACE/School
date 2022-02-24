package school;

public class School {

    public static void main(String[] args) {
        Person fred = new Student("Fred",new Date(17,4,2001),Person.Gender.MALE,10,Student.Transportation.CAR);
        Date date = new Date(23,8,1998);
        Person jojo = new Student("Jojo",date,Person.Gender.FEMALE,9,Student.Transportation.WALK);
        date.setYear(2002);
        Person kiki = new Student("Kiki",date,Person.Gender.FEMALE,12,Student.Transportation.BIKE);
        Person rocky = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        Person yee = new Teacher("Yee",new Date(23,11,2005),Person.Gender.MALE, 12, Teacher.Supervisor.COACH);
        System.out.println(Person.getNumPeople());
                
        
        
        Teacher.PrintInfo();
        
    }
    
}