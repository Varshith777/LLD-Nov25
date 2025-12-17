package advancedConcepts.designPatterns.singleton;

public class Singleton {

    private static Singleton singleton;
    private int data;

    private Singleton(int value){
        data = value;
    }

    public static Singleton getObject(int value){ // static methods can only access static variables
        if(singleton == null){
            singleton =  new Singleton(value);
        }
        return singleton;
    }

    public void printData(){
        System.out.println(data);
    }
}



/*
     Only 1 object -> restrict object creation -> private constructor
     Logic to create 1 object ->
        * to access private constructor -> public method
        * calling -> object.methodName()
        * to get an object we need to call the method, and to call the method, we need object
        * public method -> public static method
        * check if object has been created
        * logic for returning the same singleton object created on the first try


       Car c = new Car();
       c.start();

       //break -> 10 mins -> 10:22 PM
 */