package advancedConcepts.designPatterns.decorator;

// add on
public class ChocoChip implements IceCream{

    private IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        if (iceCream == null) {
            throw new IllegalArgumentException("IceCream cannot be null");
        }
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Choco Chip";
    }
}
