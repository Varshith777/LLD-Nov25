package advancedConcepts.designPatterns.builder;

public class Main {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.id(1);
//        builder.name("Ram");
//        builder.age(25);
//        builder.psp(90);
//        builder.gradYear(2022);
//        builder.phoneNumber("1234567890");
//        builder.universityName("Hogwarts");
//
//        Student student = Student.build(builder);

        Student student =
                Student.builder()
                        .id(1)
                        .name("Aswin")
                        .age(25)
                        .psp(90)
                        .gradYear(2024)
                        .phoneNumber("1234567890")
                        .universityName("Parul University")
                        .build();

    }
}
