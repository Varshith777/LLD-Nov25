package advancedConcepts.designPatterns.builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private int psp;
    private int gradYear;
    private String phoneNumber;
    private String universityName;

    public static Builder builder() {
        return new Builder();
    }

    private Student(int id, String name, int age, int psp, int gradYear, String phoneNumber, String universityName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.gradYear = gradYear;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
    }

    private Student(Builder builder) {
        this(builder.id,
                builder.name,
                builder.age,
                builder.psp,
                builder.gradYear,
                builder.phoneNumber,
                builder.universityName);
    }

    public static class Builder {
        public int id;
        public String name;
        public int age;
        public int psp;
        public int gradYear;
        public String phoneNumber;
        public String universityName;

        public Builder() {}

        public Student.Builder id(int id) {
            this.id = id;
            return this;
        }

        public Student.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Student.Builder age(int age) {
            this.age = age;
            return this;
        }

        public Student.Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Student.Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student.Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student.Builder universityName(String universityName) {
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

        public Student build(){
            validate();
            return new Student(this);
        }
    }

}
