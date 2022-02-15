package school;

public class School {

    
    public static void main(String[] args) {
        
        Date jazDate = new Date(1,2,2007);
        
        Student jazmine = new Student("Jazmin", new Date(2,1,2007), Person.Gender.FEMALE, 9, Student.Transportation.WALK);
        System.out.println(jazmine.getInfo());
        
    }
   
    
}
