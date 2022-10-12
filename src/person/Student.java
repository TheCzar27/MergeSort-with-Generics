package person;

public class Student <T extends Comparable<T>> implements Comparable<Student<T>> {
    private String ID;
    private T grade;

    public Student(String ID, T grade){
        this.ID = ID;
        this.grade = grade;
    }
        public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    
    public T getGrade() {
        return grade;
    }
    public void setGrade(T grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student<T> student){
        return this.getGrade().compareTo(student.getGrade());
    }
    @Override
    public String toString(){
        return this.ID + ": " + this.grade.toString();
    }

}
