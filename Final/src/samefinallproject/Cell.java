package samefinallproject;

public class Cell {
    private Teacher teacher ;
    private String CourseName ;
    private Room room ;

    public Cell() {
        teacher  = new Teacher() ;
        room = new Classroom() ;
    }
    Cell(String teacherId , String roomName , String courseName)
    {
        this.teacher.setID(teacherId);
        this.CourseName = courseName ;
        this.setRoomName(roomName);
    }
    Cell(Teacher teacher , String CourseName , Room room)
    {
        this.teacher.setID(teacher.getID()); ;
        this.CourseName = CourseName ;
        this.room.setName(room.getName());
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacherId(String id)
    {
        this.teacher.setID(id);
    }
    
    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoomName(String name) {
        this.room.name = name ;
    }

    public String getTeacherId()
    {
        return this.teacher.getID();
    }
    public String getRoomname()
    {
        return this.room.getName();
    }
    
    
}
