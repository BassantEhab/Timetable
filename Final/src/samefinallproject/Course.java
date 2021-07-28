package samefinallproject;

public class Course {
    private int ID ;
    private String Name ;
    private Teacher []teachers ;
    private Lab [] labs ;
    private Lecture [] lectures ;

    public Course() {
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Lab[] getLabs() {
        return labs;
    }

    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    public Lecture[] getLectures() {
        return lectures;
    }

    public void setLectures(Lecture[] lectures) {
        this.lectures = lectures;
    }
    

    public Course(int ID , String Name ,int NoOfLabs,int NoOfLectures ) {
        this.ID = ID ;
        this.Name = Name ;
        this.teachers = new Teacher[3];
        this.labs = new Lab[NoOfLabs] ;
        this.lectures = new Lecture[NoOfLectures] ;
        
    }
    
}
