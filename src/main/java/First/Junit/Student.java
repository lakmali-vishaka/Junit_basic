package First.Junit;

public class Student {
    public int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
