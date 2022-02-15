package school;

public class School {

    public static void main(String[] args) {
        Student fred = new Student("Fred",new Date(17,4,2001),Person.Gender.MALE,10,Student.Transportation.CAR);
        Date date = new Date(23,8,1998);
        Student jojo = new Student("Jojo",date,Person.Gender.FEMALE,9,Student.Transportation.WALK);
        date.setYear(2002);
        Student kiki = new Student("Kiki",date,Person.Gender.FEMALE,12,Student.Transportation.BIKE);
        Student rocky = new Student("Rocky",new Date(23,11,2005),Person.Gender.MALE,11,Student.Transportation.BIKE);
        Student jazmin = new Student("Jazmin",new Date(1,2,2007),Person.Gender.FEMALE,9,Student.Transportation.CAR);
                
        System.out.println(Person.getNumPeople());
                
        System.out.println(rocky.getInfo());
        Student.PrintInfo();
    }
    
}
