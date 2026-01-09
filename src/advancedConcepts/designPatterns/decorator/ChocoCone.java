package advancedConcepts.designPatterns.decorator;

//base add on
public class ChocoCone implements IceCream{

    private IceCream iceCream;

    public ChocoCone() { // create vanilla cone object without any prior ice cream object
    }

    public ChocoCone(IceCream iceCream) { // create vanilla cone object with existing ice-cream object
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        // if only vanilla cone then cost - 20
        // if vanilla cone added to existing ice-cream - cost = existing cost + 20
        if(iceCream == null){
            return 20;
        } else {
            return iceCream.getCost() + 30;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream == null) {
            return "Vanilla Cone ";
        } else {
            return iceCream.getDescription() + ", Chocolate Cone";
        }
    }
}
