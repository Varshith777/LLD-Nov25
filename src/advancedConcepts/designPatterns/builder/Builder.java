package advancedConcepts.designPatterns.builder;

public class Builder {
    public int id;
    public String name;
    public int age;
    public int psp;
    public int gradYear;
    public String phoneNumber;
    public String universityName;

    public Builder() {}

    public Builder id(int id) {
        this.id = id;
        return this;
    }

    public Builder name(String name) {
        this.name = name;
        return this;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Builder psp(int psp) {
        this.psp = psp;
        return this;
    }

    public Builder gradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public Builder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Builder universityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public void validate(){
        validateAge();
        validatePhoneNumber();
        validateName();
        validateGradYear();
    }

    public void validateAge(){
        if(age <= 20){
            throw new InvalidAgeException("Age must be greater than 20");
        }
    }

    public void validatePhoneNumber(){
        if(phoneNumber == null || phoneNumber.isEmpty()){
            throw new InvalidPhoneNumberException("Phone number cannot be empty");
        }
    }

    public void validateGradYear(){
        if(gradYear > 2025){
            throw new InvalidGradYearException("Grad year must be less than 2025");
        }
    }

    public void validateName(){
        if(name == null || name.isEmpty()){
            throw new InvalidNameException("Name cannot be empty");
        }
    }
}
