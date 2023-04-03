package tree;


public class Human {
    private String fullName;
    private Sex sex;
    private String birthday;

    public Human(String fullName) {
        this(fullName, Sex.none, "-" );
    }

    public Human(String fullName, String birthday){
        this(fullName, Sex.none, birthday);
    }

    public Human(String fullName, Sex sex, String birthday){
        this.fullName = fullName;
        this.sex = sex;
        this.birthday = birthday;
    }


    public String getFullName() {
        return fullName;
    }
  
}