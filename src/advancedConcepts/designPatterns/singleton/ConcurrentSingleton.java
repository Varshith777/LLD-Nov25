package advancedConcepts.designPatterns.singleton;

public class ConcurrentSingleton {

    private static ConcurrentSingleton singleton;
    private int data;

    private ConcurrentSingleton(int value){
        data = value;
    }

    public static ConcurrentSingleton getObject(int value){ // static methods can only access static variables
        if(singleton == null){
            synchronized (ConcurrentSingleton.class){
                if(singleton == null){
                    singleton = new ConcurrentSingleton(value);
                }
            }
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