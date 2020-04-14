package OopsPartOne;

public class Person {
    //Thre instance variables
    private String firstName;
    private String lastName;
    private int age;

    //instance methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age<0 || age>100) {
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen() {
        if(getAge()>12 && getAge()<20) {
            return true;
        }
        else return false;
    }
    public String getFullName(){
        String fullName = getFirstName() + " " + getLastName();
        if(getFirstName().isEmpty()) {
            return getLastName();
        }
        else if(getLastName().isEmpty()){
            return getFirstName();
        }
        else {
            return fullName;
        }
    }
}
