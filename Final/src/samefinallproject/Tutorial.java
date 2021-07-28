package samefinallproject;


abstract public class Tutorial {
    private Teacher teacher ;
    private int Num_Of_Hours ;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNum_Of_Hours() {
        return Num_Of_Hours;
    }

    public void setNum_Of_Hours(int Num_Of_Hours) {
        this.Num_Of_Hours = Num_Of_Hours;
    }
    
    
}

class Lab extends Tutorial
{
    Laboratoty laboratory ;
    Lab(Teacher teacher ,int Num_Of_Hours ,Laboratoty laboratory)
    {
        this.setTeacher(teacher);
        this.setNum_Of_Hours(Num_Of_Hours);
        this.laboratory = laboratory ;
    }
}

class Lecture extends Tutorial
{
    Classroom classroom ;
    Lecture (Teacher teacher , int Num_Of_Hours , Classroom classroom)
    {
        this.setTeacher(teacher);
        this.setNum_Of_Hours(Num_Of_Hours);
        this.classroom = classroom ;
    }
}


