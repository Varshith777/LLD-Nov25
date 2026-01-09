package advancedConcepts.designPatterns.decorator;

// add on
public class ChocolateScoop implements IceCream{

    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream) {
        if (iceCream == null) {
            throw new IllegalArgumentException("IceCream cannot be null");
        }
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Scoop";
    }
}
