package school;

public class Teacher extends Person {
    public static enum Supervisor {
        COACH,ADVISOR,LEADERSHIP,NONE
    };
    private static int numTeachers;
    private int yearsTeaching;
    private Supervisor supervisor;
    
    public Teacher(){
        initTeacher(0, Supervisor.NONE);
    }
    public Teacher(String _name,Date _date,Gender _gender,
    int _yearsTeaching, Supervisor _supervisor) {
        super(_name,_date,_gender);
        
        initTeacher(_yearsTeaching, _supervisor);
    }
    
    private void initTeacher(int _yearsTeaching, Supervisor _supervisor) {
        yearsTeaching = _yearsTeaching;
        supervisor = _supervisor;
        numTeachers++;
    }
    public int getYearsTeaching(){
        return(yearsTeaching);
    }
    public Supervisor getSupervisor(){
        return(supervisor);
    }
    public String getInfo() {
        return (super.getInfo() + " " + yearsTeaching + " " + supervisor);
    }
    
    public void setYearsTeaching(int _yearsTeaching){
        yearsTeaching = _yearsTeaching;
    }
    public void setSupervisor(Supervisor _supervisor){
        supervisor = _supervisor;
    }
    public static void PrintInfo() {
        System.out.println("PrintInfo Teacher =============");

//Extended for loop ,   For each loop.        
        for (Person aPerson : people)
        {
            
            if(aPerson instanceof Teacher)
                System.out.println(aPerson.getInfo());
        }

//        for (int i=0;i<people.size();i++) {
//            System.out.println(people.get(i).getInfo());
//        }

    } 
   
}