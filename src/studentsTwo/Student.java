package studentsTwo;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Student(String firstName, String lastName, int age, String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getHomeTown(){
        return this.homeTown;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHomeTown(String homeTown){
        this.homeTown = homeTown;
    }
    public String getString(){
        return String.format("%s %s is %d years old",
                this.getFirstName(),
                this.getLastName(),
                this.getAge());
    }
}
