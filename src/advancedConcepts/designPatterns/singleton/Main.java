package advancedConcepts.designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getObject(5);
        Singleton s2 = Singleton.getObject(6);
        Singleton s3 = Singleton.getObject(7);
        Singleton s4 = Singleton.getObject(8);

        s1.printData(); // 5
        s4.printData(); // 5
    }
}
