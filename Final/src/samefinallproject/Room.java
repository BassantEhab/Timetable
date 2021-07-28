package samefinallproject;


abstract public class Room {
    String name ;
    private Boolean istaken[][] ;

    Room()
    {
        istaken = new Boolean[TimeTable.DaysPerWeek][TimeTable.HoursPerDay] ;
        istaken[0][0] = false ;
    }
    Room (String name)
    {
        this();
        this.name = name ;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
class Laboratoty extends Room{

    public Laboratoty() {
        super();
    }
    
    Laboratoty(String name)
    {
        super(name) ;
        
    }
    
}
class Classroom extends Room{
    Classroom(String name)
    {
        super(name);
    }

    Classroom() {
        super();
    }
}
