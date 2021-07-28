package samefinallproject;


public class Teacher {
    private String ID ;
    private String Phone ;
    private String Email;
    private Boolean istaken[][] ;
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public Teacher() {
        istaken = new Boolean[TimeTable.DaysPerWeek][TimeTable.HoursPerDay] ;
        istaken[0][0] = false ;
    }
    
    
}
